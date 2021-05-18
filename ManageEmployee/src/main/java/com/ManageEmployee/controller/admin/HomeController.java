package com.ManageEmployee.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.jvnet.hk2.annotations.Service;

import com.ManageEmployee.service.HomeService;

@Controller(value = "homeControllerAdmin")
public class HomeController {
  
   @RequestMapping(value = "/home", method = RequestMethod.GET)
   public ModelAndView homePage() {
	   
      ModelAndView mav = new ModelAndView("admin/home");

      return mav;
   }
}