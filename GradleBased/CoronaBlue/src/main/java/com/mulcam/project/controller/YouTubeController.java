package com.mulcam.project.controller;

import org.springframework.web.servlet.ModelAndView;

import com.mulcam.project.vo.YoutubeVO;

public interface YouTubeController {
	
	public ModelAndView youtube() ;

	public ModelAndView youtubeUpload(YoutubeVO vo) ;
	
}
