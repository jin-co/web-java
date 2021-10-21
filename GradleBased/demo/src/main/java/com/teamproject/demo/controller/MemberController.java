package com.teamproject.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teamproject.demo.service.MemberServiceImpl;
import com.teamproject.demo.vo.MemberVO;


@Controller
public class MemberController {
	
    @Autowired
    MemberServiceImpl memberServiceImpl;

    @RequestMapping(value="/SignIn", method = RequestMethod.GET)
    public String signin(@RequestParam(value="idx",required=true) int idx, HttpServletRequest request) throws Exception {
        
    	request.setAttribute("idx", idx);
    	
    	return "signin";
    }
    
    
    @RequestMapping(value="/SignIn", method = RequestMethod.POST)
    ModelAndView signin(@RequestParam(value="idx",required=true) int idx, @RequestParam(value="id",required=true) String id, @RequestParam(value="password",required=true) String password, HttpServletRequest request) throws Exception {
    	ModelAndView modelAndView = new ModelAndView();
    	try {
  

    		MemberVO result = memberServiceImpl.searchMember(id, password);
    		

			
    		HttpSession session = request.getSession();
			session.setAttribute("name", result.getName());
			session.setAttribute("id", result.getId());
			
			if ( idx == 0) {
			
				modelAndView.addObject("restult", "로그인 성공");
				modelAndView.setViewName("index");
			} else {
				modelAndView.addObject("restult", "로그인 성공, 코멘트 페이지 ");
				modelAndView.setViewName("redirect:./CookingShowDetail?idx="+idx);
				
			}
				
			
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.addObject("restult", "로그인 오류");
			modelAndView.setViewName("signin");
		}
    	return modelAndView;
    }
    

    
    @RequestMapping(value="/SignOut", method = RequestMethod.GET)
    public String signout(HttpServletRequest request) throws Exception {
    	HttpSession session = request.getSession();
		session.removeAttribute("name");
		session.removeAttribute("id");
        return "index";
    }
    
    
    @RequestMapping(value="/SignUp", method = RequestMethod.GET)
    public String signup() throws Exception {
        return "signup";
    }
    
    @RequestMapping(value="/SignUp", method = RequestMethod.POST)
    ModelAndView signup(@ModelAttribute MemberVO mb, HttpServletRequest request) throws Exception {
    	ModelAndView modelAndView = new ModelAndView();
    	try {
    		System.out.println("MemberController "+ mb.getId() );
    		System.out.println("MemberController "+ mb.getPassword());
    		System.out.println("MemberController "+ mb.getName());
    		System.out.println("MemberController "+ mb.getEmail());

    		MemberVO result = memberServiceImpl.registerMember(mb);
    		
    		System.out.println("MemberController after");
			
    		HttpSession session = request.getSession();
			session.setAttribute("name", result.getName());
			session.setAttribute("id", result.getId());
			modelAndView.addObject("member", result);
			modelAndView.addObject("restult", "회원가입 성공");
			modelAndView.setViewName("index");

			
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.addObject("restult", "회원가입 오류");
			modelAndView.setViewName("signup");
		}
    	return modelAndView;
    }

}
