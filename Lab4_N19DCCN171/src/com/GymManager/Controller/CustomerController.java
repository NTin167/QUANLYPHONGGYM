package com.GymManager.Controller;

import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GymManager.Entity.CustomerEntity;

@Controller
@RequestMapping("admin/customer")
@Transactional
public class CustomerController extends MethodAdminController {
	@Autowired
	SessionFactory factory;

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		CustomerEntity customer = new CustomerEntity();
		customer.setCustomerId(this.toPK("KH", "CustomerEntity", "customerId"));
		model.addAttribute("customer", customer);
		return "admin/customer";
	}

}
