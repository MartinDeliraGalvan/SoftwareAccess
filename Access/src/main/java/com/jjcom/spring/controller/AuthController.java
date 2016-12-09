package com.jjcom.spring.controller;

import com.jjcom.subsystem.database.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.jjcom.subsystem.database.*;

/*Gets credentials from login page and goes through authentication*/
public class AuthController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		InternalDB internalDB = new InternalDB();

		ModelAndView model;

		if (internalDB.authenticate(username, password) != null) {
			System.out.println("Sucess");
			model = new ModelAndView("resources/resources");
		} else {
			model = new ModelAndView("login");
		}

		return model;
	}
}
