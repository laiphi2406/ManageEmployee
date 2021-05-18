package com.ManageEmployee.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.jvnet.hk2.annotations.Service;

import com.ManageEmployee.service.HomeService;

@Controller(value = "newControllerAdmin")
public class NewController {
  
   @RequestMapping(value = "/new/list", method = RequestMethod.GET)
   public ModelAndView showList() {
	   
      ModelAndView mav = new ModelAndView("admin/new/list");

      return mav;
   }
   
   @RequestMapping(value = "/new/edit", method = RequestMethod.GET)
   public ModelAndView editNew() {
	   
      ModelAndView mav = new ModelAndView("admin/new/edit");

      return mav;
   }
}