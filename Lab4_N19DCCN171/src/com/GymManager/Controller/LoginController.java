package com.GymManager.Controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GymManager.Entity.AccountEntity;
import com.GymManager.Serializer.LoginRequest;
import com.GymManager.Service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	@Autowired
	HttpSession session;
	
	@RequestMapping(value = "log-in", method = RequestMethod.GET)
	public String login(ModelMap model){
        model.addAttribute("loginRequest", new LoginRequest());
        return "log-in";
    }
  @RequestMapping(value="log-in", method = RequestMethod.POST)
    public String login(ModelMap model, @ModelAttribute("loginRequest") LoginRequest loginRequest){
        AccountEntity user = loginService.checkLoginAdmin(loginRequest.getUsername(), loginRequest.getPassword());
        if (user == null) {
            model.addAttribute("message", "Vui lòng kiểm tra tài khoản hoặc mật khẩu!");
            return "log-in";
        }
    session.setAttribute("loginSession", user);
    return "admin/index";
  }
  
}
 