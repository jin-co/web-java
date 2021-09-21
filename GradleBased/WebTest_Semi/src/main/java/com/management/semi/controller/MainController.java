package com.management.semi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.management.semi.service.AdminService;

@Controller
public class MainController {
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="/")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView("main");
		mav.addObject("page", "main");
		return mav;
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView main(@RequestParam("id") String id,
			@RequestParam("password") String password,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("admin");
		try {
			adminService.login(id, password);
			HttpSession session = request.getSession();
			session.setAttribute("adminId", id);
			mav.addObject("page", "admin");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", e.getMessage());
			mav.addObject("page", "error");
		}
		return mav;
	}
}
