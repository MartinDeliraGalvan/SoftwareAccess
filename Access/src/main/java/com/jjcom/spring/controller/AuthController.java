package com.jjcom.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class AuthController {
   @RequestMapping("resources/resources")  
   public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
	  String userName=request.getParameter("userName");  
      String password=request.getParameter("password");
      String message;
      if(userName == "mdelira") {
    	  message = "Welcome " +userName + ".";
    	  ModelAndView model = new ModelAndView("resources/resources");
	      return new ModelAndView("resources/resourcesa", "message", message);  
 
      }else{
    	  message = "Wrong username or password.";
    	  return new ModelAndView("errorPage", 
    			  "message", message);
      }
   }
}