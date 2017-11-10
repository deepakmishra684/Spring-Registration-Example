package com.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.model.User;

public class UserValidator implements Validator {

	public boolean supports(Class cls) {
		return User.class.equals(cls);
	}

	public void validate(Object commond, Errors errs) {
		System.out.println("Validator validate called ");
		User user = (User) commond;
		if (user.getUsername() == null || user.getUsername().length() == 0) {
			errs.rejectValue("username", "err.username.required", new Object[] {}, "Username Required");
		}
		if (user.getPassword() == null || user.getPassword().length() == 0) {
			errs.rejectValue("password", "err.password.required", new Object[] {}, "Password Required");
		}
		if (user.getGender() == null || user.getGender().length() == 0) {
			errs.rejectValue("gender", "err.gender.required", new Object[] {}, "Select Gender");
		}
		if (user.getCity() == null || user.getCity().length() == 0) {
			errs.rejectValue("city", "err.city.required", new Object[] {}, "Select City");
		}
		if (user.getCourse() == null || user.getCourse().length() == 0) {
			errs.rejectValue("course", "err.course.required", new Object[] {}, "Select Course");
		}
	}
}