package com.mulcam.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mulcam.project.service.YoutubeService;
import com.mulcam.project.vo.YoutubeVO;

@Controller
public class YouTubeControllerImpl implements YouTubeController {
	
	@Autowired
	YoutubeService service;
	
	@Override
	@GetMapping("/youtube")
	public ModelAndView youtube() {
		ModelAndView mv = new ModelAndView("youtube");
		ArrayList<YoutubeVO> ytList = new ArrayList<YoutubeVO>();
		
		ytList = service.getAllYoutube();
		
		for (YoutubeVO vo: ytList) {
			System.out.println(vo.getId());
			System.out.println(vo.getTitle());
			System.out.println(vo.getUrl());
			System.out.println(vo.getKey());
		}
		
		mv.addObject("ytList", ytList);

		return mv;
	}

	@Override
	@PostMapping("/addYoutube")
	public ModelAndView youtubeUpload(@ModelAttribute YoutubeVO vo) {
		ModelAndView mv = new ModelAndView("redirect:./youtube");
		
		service.addYoutube(vo);

		return mv;
	}

}
