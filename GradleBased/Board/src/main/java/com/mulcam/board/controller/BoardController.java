package com.mulcam.board.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.mulcam.board.vo.Board;

public interface BoardController {
	String writeform();
	ModelAndView boardWrite(@ModelAttribute Board board, MultipartHttpServletRequest multi);
	ModelAndView boardList(@RequestParam(value="page",required=false, defaultValue="1") int page);
	
}
