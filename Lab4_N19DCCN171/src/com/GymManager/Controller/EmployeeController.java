package com.GymManager.Controller;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/employee")
@Transactional
public class EmployeeController {
	@Autowired
	SessionFactory factory;
	@RequestMapping("")
	public String index(ModelMap model) {
		return "admin/employee";
	}
}
