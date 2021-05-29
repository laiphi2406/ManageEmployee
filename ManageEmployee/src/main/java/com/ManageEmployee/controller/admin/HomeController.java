package com.ManageEmployee.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ManageEmployee.dao.IAccountDAO;
import com.ManageEmployee.model.AccountModel;

@Controller(value = "homeControllerAdmin")
public class HomeController {
  
	@Autowired
	private IAccountDAO accountService;
	
   @RequestMapping(value = "/home", method = RequestMethod.GET)
   public ModelAndView homePage(HttpServletRequest request) {
	  
	  ModelAndView mav = new ModelAndView("");
      
	  if(request.getSession() != null){
		  mav.setViewName("home");
	  }
	  else {
		  mav.setViewName("checkaccount");
	  }
      return mav;
   }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
   @RequestMapping(value = "/checkaccount", method = RequestMethod.POST)
	   public ModelAndView checkaccount(@RequestParam String username,@RequestParam String password) {

	   ModelAndView mav = new ModelAndView("");
	   List<AccountModel> account = accountService.findByUsername(username,password);
	      
	   if(account == null || account.size() == 0) {
		   mav.addObject("error", "Invalid username and password!");
		   mav.setViewName("login");
		     return mav;
	   }
	   else {
		   // TODO
		   mav.addObject("msg", "You've been logged out successfully.");

		   mav = new ModelAndView("redirect:/home");
		    return mav;

	   }



   }
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("redirect:/login");
	}
	

   
}