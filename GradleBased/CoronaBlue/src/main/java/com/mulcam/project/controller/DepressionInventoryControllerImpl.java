package com.mulcam.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mulcam.project.service.DepressionInventoryService;
import com.mulcam.project.vo.DepressionInventoryVO;

@Controller
public class DepressionInventoryControllerImpl implements DepressionInventoryController {

	@Autowired
	DepressionInventoryService diService;
	
	@Override
	@GetMapping("/bdi")
	public ModelAndView bdi() {
		ModelAndView mv = new ModelAndView();
		ArrayList<DepressionInventoryVO> diList = new ArrayList<DepressionInventoryVO>();
		diList = diService.getAllQuestions();
		
		for(DepressionInventoryVO di : diList) {
			System.out.println("DepressionInventory id : " +   di.getBdiId()  );
			System.out.println("DepressionInventory no : " +   di.getAnswerNo()  );
			System.out.println("DepressionInventory answer : " +   di.getAnswer()  );
			System.out.println("DepressionInventory point : " +   di.getPoint()  );
		}
		
		mv.addObject("diList", diList);
		mv.setViewName("bdi");
		return mv;
	}

}
