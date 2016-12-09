package com.jjcom.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class AuthController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ModelAndView model;
				
		if (username.equals("mdelira") && password.equals("lv223")) {
		 model = new ModelAndView("resources/resources?name=Martin Delira");
		}
		else{
			model = new ModelAndView("login");
		}
					
		return model;
	}
}
