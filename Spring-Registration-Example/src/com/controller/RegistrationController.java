package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.validator.UserValidator;

@Controller
@SuppressWarnings("unchecked")
public class RegistrationController {

	@Autowired
	private UserValidator userValidator;

	@RequestMapping(value = "/doRegister.htm", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("user") User user, BindingResult result) {
		ModelAndView model = null;
		String viewResult = "register";
		System.out.println("doLogin Called");
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			System.out.println("Error Count= " + result.getErrorCount());
			model = new ModelAndView(viewResult, "user", user);
			return model;
		}

		String un = user.getUsername();
		String pw = user.getPassword();

		// Note:
		// If user name and password are same the assumption for login done
		// You can implement DAO and use in your project
		
			viewResult = "home";
		

		// Creating a ModelAndView Object and adding jsp page and model data
		model = new ModelAndView(viewResult, "user", user);
		return model;
	}

	@RequestMapping("/register.htm")
	public String showLogin(Map model) {
		User user = new User();
		user.setUsername("Deepak");
		model.put("user", user);
		return "register";
	}
}