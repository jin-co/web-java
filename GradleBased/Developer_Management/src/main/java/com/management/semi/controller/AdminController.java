package com.management.semi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.management.semi.service.ProgrammerService;
import com.management.semi.vo.Programmer;

@Controller
public class AdminController {
	@Autowired
	ProgrammerService programmerService;
	
	@RequestMapping(value="/admin")
	public ModelAndView manageWorkers() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("page", "admin");
		return mav;
	}
	
	@RequestMapping(value="/search")
	public ModelAndView searchAll() {
		ModelAndView mav = new ModelAndView();
		try {
			List<Programmer> programmers = programmerService.searchAll();
			mav.addObject("programmers", programmers);
			mav.addObject("page", "search");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", e.getMessage());
			mav.addObject("page", "error");
		}
		return mav;
	}
	
	@RequestMapping(value="/search_result", method=RequestMethod.POST)
	public ModelAndView searchById(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView();
		try {
			Programmer programmer = programmerService.searchProgrammer(id);
			mav.addObject("programmer", programmer);
			mav.addObject("page", "search_result");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", e.getMessage());
			mav.addObject("page", "error");
		}
		return mav;
	}
	
	@RequestMapping(value="/register")
	public ModelAndView registerWorker() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("page", "register");
		return mav;
	}
	
	@RequestMapping(value="/register_result", method=RequestMethod.POST)
	public ModelAndView registerWorker(@ModelAttribute("programmer") 
	Programmer programmer) {
		ModelAndView mav = new ModelAndView();
		try {
			if (programmer.getExperience() <= 3) {
				programmer.setRate(10000);
			} else if (programmer.getExperience() <= 5) {
				programmer.setRate(25000);
			} else if (programmer.getExperience() <= 7) {
				programmer.setRate(50000);
			} else if (programmer.getExperience() <= 9) {
				programmer.setRate(100000);
			} else {
				programmer.setRate(200000);
			}
			programmerService.registerWorker(programmer);
			List<Programmer> programmers = programmerService.searchAll();
			mav.addObject("programmers", programmers);
			mav.addObject("page", "search");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", e.getMessage());
			mav.addObject("page", "error");
		}
		return mav;
	}
	
	@RequestMapping(value="/delete")
	public ModelAndView deleteWorker() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("page", "delete");
		return mav;
	}
	
	@RequestMapping(value="/delete_result", method=RequestMethod.POST)
	public ModelAndView deleteWorkers(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView();
		try {
			programmerService.deleteWorker(id);
			List<Programmer> programmers = programmerService.searchAll();
			mav.addObject("programmers", programmers);
			mav.addObject("page", "deleted");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", e.getMessage());
			mav.addObject("page", "error");
		}
		return mav;
	}
	
	@RequestMapping(value="/update")
	public ModelAndView updateWorker() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("page", "update");
		return mav;
	}
	
	@RequestMapping(value="/update_form")
	public ModelAndView updateWorker(@RequestParam("id") String id,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		try {
			Programmer programmer = programmerService.searchProgrammer(id);
			mav.addObject("programmer", programmer);
			mav.addObject("page", "update");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", e.getMessage());
			mav.addObject("page", "error");
		}
		return mav;
	}
	
	// update
	@RequestMapping(value="/update_result", method=RequestMethod.POST)
	public ModelAndView updateWorker(@ModelAttribute("programmer") 
	Programmer programmer,
	HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		programmer.setId(id);
		try {
			programmerService.updateWorker(programmer, id);
			List<Programmer> programmers = programmerService.searchAll();
			mav.addObject("programmers", programmers);
			mav.addObject("page", "deleted");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", e.getMessage());
			mav.addObject("page", "error");
		}
		return mav;
	}
	
	@RequestMapping(value="/man_resource")
	public ModelAndView showHomanResources() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("page", "man_resource");
		return mav;
	}
}
