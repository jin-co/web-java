package com.mulcam.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mulcam.project.AddrToPositon;
import com.mulcam.project.AddrToPositon.Point;
import com.mulcam.project.service.HiraRateServiceImpl;
import com.mulcam.project.vo.HiraRateVO;

@Controller
public class HiraRateControllerImpl implements HiraRateController{
	
	
	@Autowired
	HiraRateServiceImpl service;
	
	
	@Override
	@GetMapping("/hiraRate")
	public ModelAndView hirarate() {
		ModelAndView mv= new ModelAndView();
		
		ArrayList<HiraRateVO> voList = new ArrayList<HiraRateVO>();
		
		voList = service.SearchAllPos();
		
		
		
		for (HiraRateVO vo : voList) {
			System.out.println(" 병원명     " + vo.getName());
			System.out.println(" 등급     " + vo.getRate());
			System.out.println("  posX       " + vo.getPosx());
			System.out.println("  posY       " + vo.getPosy());
			
			vo.setComments(vo.getName()+"("+vo.getRate()+")");
		}	
		
		
		mv.addObject("posList", voList);
		mv.setViewName("hirarate");
		
		
		return mv;
	}

	
	@Override
	@GetMapping("/temphirarate")
	public void temp_hirarate() {
		// db에서 병원별 주소를 읽어와서 posx 와 posy를 다시 입력한다.
		
		ArrayList<HiraRateVO> voList = new ArrayList<HiraRateVO>();
		
		voList = service.SearchAllAddress();
		
		for (HiraRateVO vo : voList) {
			System.out.println(" 병원명     " + vo.getName());
			System.out.println("  주소       " + vo.getAddress());
			
			AddrToPositon trans = new AddrToPositon();
			Point pos = trans.addrToPositon(vo.getAddress());
			
			vo.setPosx(pos.x);
			vo.setPosy(pos.y);
			
			service.RegistPosToAddress(vo);
		}
		
		
		
	}

}
