package com.mulcam.board.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.mulcam.board.service.BoardService;
import com.mulcam.board.vo.Board;
import com.mulcam.board.vo.PageInfo;

@Controller
@RequestMapping("/board")
public class BoardControllerImpl implements BoardController {
	@Autowired
	private BoardService boardService;
	
	@Override
	@GetMapping("/writeform")
	public String writeform() {
		return "/board/writeform";
	}

	@Override
	@PostMapping("/boardwrite")
	public ModelAndView boardWrite(@ModelAttribute Board board, MultipartHttpServletRequest multi) {
		ModelAndView mv = new ModelAndView();
		String path = multi.getServletContext().getRealPath("/boardupload/");
		try {
			MultipartFile orgfile = multi.getFile("upfile");
			File destFile = new File(path+orgfile.getOriginalFilename());
			board.setBOARD_FILE(orgfile.getOriginalFilename());
			orgfile.transferTo(destFile);
			boardService.regBoard(board);
			mv.setViewName("redirect:/board/boardlist");
		} catch(Exception e) {
			e.printStackTrace();
			mv.addObject("err", "새 글 등록 실패");
			mv.setViewName("/board/err");
		}
		return mv;
	}

	@Override
	@RequestMapping(value="boardlist", method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView boardList(@RequestParam(value="page",required=false, defaultValue="1") int page) {
		PageInfo pageInfo = new PageInfo();
		ModelAndView mv = new ModelAndView();
		try {
			List<Board> articleList = boardService.getBoardList(page,pageInfo);
			mv.addObject("pageInfo", pageInfo);
			mv.addObject("articleList", articleList);
			mv.setViewName("/board/listform");
		} catch(Exception e) {
			e.printStackTrace();
			mv.addObject("err",e.getMessage());
			mv.setViewName("/board/err");
		}
		return mv;
	}

}
