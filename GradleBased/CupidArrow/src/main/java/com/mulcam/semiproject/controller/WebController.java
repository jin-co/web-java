package com.mulcam.semiproject.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.mulcam.semiproject.vo.MailVO;
import com.mulcam.semiproject.vo.MemberVO;

public interface WebController {
	
	public String index(Cookie rCookie, Model model) ;
	public void sendmail(MailVO mailVO, HttpServletResponse response )  throws IOException;
	public ModelAndView login(MemberVO memberVO, HttpServletResponse response, HttpServletRequest request)  throws IOException;
	public ModelAndView logout()  throws IOException;
	public String juso(HttpServletRequest request, Model model) throws Exception ;
	public String juso2(HttpServletRequest request, Model model) throws Exception ;
	public void distanceCalc(String sourceAddr, String destinationAddr, HttpServletResponse response)  throws IOException;
	public ModelAndView signup(MemberVO memberVO)  throws IOException;
	public ModelAndView addAddress(MemberVO memberVO)  throws IOException;
	public ModelAndView DeleteAddress(HttpServletRequest request) ;
	
	
	
}
