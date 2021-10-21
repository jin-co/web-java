package com.mulcam.semiproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mulcam.semiproject.common.DistanceCalc;
import com.mulcam.semiproject.service.MailServiceImpl;
import com.mulcam.semiproject.vo.BookVO;
import com.mulcam.semiproject.vo.MailVO;
import com.mulcam.semiproject.vo.MemberVO;

@Controller
public class WebControllerImpl implements WebController {

	@Autowired
	MailServiceImpl service;

	@Override
	@GetMapping("/")
	public String index(@CookieValue(value = "cId", required = false) Cookie rCookie, Model model) {

		// rCookie.setMaxAge(0);

		if (rCookie != null) {
			System.out.println(" root Cookie");
			String[] cidArry = rCookie.getValue().split("#");
			System.out.println(rCookie.getValue());
			System.out.println(cidArry[0]);
			System.out.println(cidArry[1]);
			System.out.println(cidArry[2]);

			model.addAttribute("id", cidArry[0]);
			model.addAttribute("password", cidArry[1]);
			model.addAttribute("rememberId", cidArry[2]);
		}

//		System.out.println(" rCookie.getValue() ");
		return "index";
	}

	@Override
	@PostMapping("/Mail")
	@ResponseBody
	public void sendmail(@ModelAttribute MailVO mailVO, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		try {
			service.mailSend(mailVO);
			out.append("성공했습니다.");
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	@RequestMapping("/Signin")
	public ModelAndView login(@ModelAttribute MemberVO memberVO, HttpServletResponse response,
			HttpServletRequest request) throws IOException {
		ModelAndView mv = new ModelAndView();


		try {
			// 로그인 시도
			MemberVO result = service.login(memberVO);
			if (result != null) {

				System.out.println("making Cookie");
				Cookie rCookie = null;

				System.out.println("isRememberId");
				System.out.println(memberVO.isRememberId());

				if (memberVO.isRememberId()) {
					rCookie = new Cookie("cId",
							memberVO.getId() + "#" + memberVO.getPassword() + "#" + memberVO.isRememberId());
					rCookie.setMaxAge(60 * 60 * 24 * 15);
				} else {
					rCookie = new Cookie("cId", "##" + memberVO.isRememberId());
					rCookie.setMaxAge(0);
				}
				rCookie.setPath("/");
				System.out.println("addCookie(rCookie);");
				response.addCookie(rCookie);

				// 기존 편지 입력내용 되돌리기
				result.setsMailTitle(memberVO.getsMailTitle());
				result.setsMailName(memberVO.getsMailName());
				result.setsMailEmail(memberVO.getsMailEmail());
				result.setsMailContent(memberVO.getsMailContent());
				result.setSection("login");
				mv.addObject("userInfo", result);

				// } else {
				// out.append("로그인에 실패하였습니다." );
			}

			// 주소록 정보 가져오기
			ArrayList<BookVO> addressList = service.searchAddressById(memberVO.getId());
			mv.addObject("addressList", addressList);
			for (BookVO list : addressList) {
				System.out.println(list.getRname());
				System.out.println(list.getRemail());
			}

			mv.setViewName("index");

		} catch (Exception e) {
			e.printStackTrace();
			mv.setViewName("error");
		}

		return mv;
	}

	@Override
	@GetMapping("/Signout")
	public ModelAndView logout() throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.addObject("userInfo", null);
		mv.setViewName("redirect:./");
		return mv;
	}

	@Override
	@RequestMapping("/jusoPopup")
	public String juso(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String inputYn = request.getParameter("inputYn"); 
		String roadFullAddr = request.getParameter("roadFullAddr"); 
		String roadAddrPart1 = request.getParameter("roadAddrPart1"); 
		String roadAddrPart2 = request.getParameter("roadAddrPart2"); 
		String engAddr = request.getParameter("engAddr"); 
		String jibunAddr = request.getParameter("jibunAddr"); 
		String zipNo = request.getParameter("zipNo"); 
		String addrDetail = request.getParameter("addrDetail"); 
		String admCd    = request.getParameter("admCd");
		String rnMgtSn = request.getParameter("rnMgtSn");
		String bdMgtSn  = request.getParameter("bdMgtSn");
		String detBdNmList  = request.getParameter("detBdNmList");	

		String bdNm  = request.getParameter("bdNm");
		String bdKdcd  = request.getParameter("bdKdcd");
		String siNm  = request.getParameter("siNm");
		String sggNm  = request.getParameter("sggNm");
		String emdNm  = request.getParameter("emdNm");
		String liNm  = request.getParameter("liNm");
		String rn  = request.getParameter("rn");
		String udrtYn  = request.getParameter("udrtYn");
		String buldMnnm  = request.getParameter("buldMnnm");
		String buldSlno  = request.getParameter("buldSlno");
		String mtYn  = request.getParameter("mtYn");
		String lnbrMnnm  = request.getParameter("lnbrMnnm");
		String lnbrSlno  = request.getParameter("lnbrSlno");
		String emdNo  = request.getParameter("emdNo");
		
		model.addAttribute("inputYn",inputYn);
		model.addAttribute("roadFullAddr",roadFullAddr);
		model.addAttribute("roadAddrPart1",roadAddrPart1);
		model.addAttribute("roadAddrPart2",roadAddrPart2);
		model.addAttribute("engAddr",engAddr);
		model.addAttribute("jibunAddr",jibunAddr);
		model.addAttribute("zipNo",zipNo);
		model.addAttribute("addrDetail",addrDetail);
		model.addAttribute("admCd",admCd);
		model.addAttribute("rnMgtSn",rnMgtSn);
		model.addAttribute("bdMgtSn",bdMgtSn);
		model.addAttribute("detBdNmList",detBdNmList);

		model.addAttribute("bdNm",bdNm);
		model.addAttribute("bdKdcd",bdKdcd);
		model.addAttribute("siNm",siNm);
		model.addAttribute("sggNm",sggNm);
		model.addAttribute("emdNm",emdNm);
		model.addAttribute("liNm",liNm);
		model.addAttribute("rn",rn);
		model.addAttribute("udrtYn",udrtYn);
		model.addAttribute("buldMnnm",buldMnnm);
		model.addAttribute("buldSlno",buldSlno);
		model.addAttribute("mtYn",mtYn);
		model.addAttribute("lnbrMnnm",lnbrMnnm);
		model.addAttribute("lnbrSlno",lnbrSlno);
		model.addAttribute("emdNo",emdNo);
		return "jusoPopup";

	}
	
	@Override
	@RequestMapping("/jusoPopup2")
	public String juso2(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String inputYn = request.getParameter("inputYn"); 
		String roadFullAddr = request.getParameter("roadFullAddr"); 
		String roadAddrPart1 = request.getParameter("roadAddrPart1"); 
		String roadAddrPart2 = request.getParameter("roadAddrPart2"); 
		String engAddr = request.getParameter("engAddr"); 
		String jibunAddr = request.getParameter("jibunAddr"); 
		String zipNo = request.getParameter("zipNo"); 
		String addrDetail = request.getParameter("addrDetail"); 
		String admCd    = request.getParameter("admCd");
		String rnMgtSn = request.getParameter("rnMgtSn");
		String bdMgtSn  = request.getParameter("bdMgtSn");
		String detBdNmList  = request.getParameter("detBdNmList");	

		String bdNm  = request.getParameter("bdNm");
		String bdKdcd  = request.getParameter("bdKdcd");
		String siNm  = request.getParameter("siNm");
		String sggNm  = request.getParameter("sggNm");
		String emdNm  = request.getParameter("emdNm");
		String liNm  = request.getParameter("liNm");
		String rn  = request.getParameter("rn");
		String udrtYn  = request.getParameter("udrtYn");
		String buldMnnm  = request.getParameter("buldMnnm");
		String buldSlno  = request.getParameter("buldSlno");
		String mtYn  = request.getParameter("mtYn");
		String lnbrMnnm  = request.getParameter("lnbrMnnm");
		String lnbrSlno  = request.getParameter("lnbrSlno");
		String emdNo  = request.getParameter("emdNo");
		
		model.addAttribute("inputYn",inputYn);
		model.addAttribute("roadFullAddr",roadFullAddr);
		model.addAttribute("roadAddrPart1",roadAddrPart1);
		model.addAttribute("roadAddrPart2",roadAddrPart2);
		model.addAttribute("engAddr",engAddr);
		model.addAttribute("jibunAddr",jibunAddr);
		model.addAttribute("zipNo",zipNo);
		model.addAttribute("addrDetail",addrDetail);
		model.addAttribute("admCd",admCd);
		model.addAttribute("rnMgtSn",rnMgtSn);
		model.addAttribute("bdMgtSn",bdMgtSn);
		model.addAttribute("detBdNmList",detBdNmList);

		model.addAttribute("bdNm",bdNm);
		model.addAttribute("bdKdcd",bdKdcd);
		model.addAttribute("siNm",siNm);
		model.addAttribute("sggNm",sggNm);
		model.addAttribute("emdNm",emdNm);
		model.addAttribute("liNm",liNm);
		model.addAttribute("rn",rn);
		model.addAttribute("udrtYn",udrtYn);
		model.addAttribute("buldMnnm",buldMnnm);
		model.addAttribute("buldSlno",buldSlno);
		model.addAttribute("mtYn",mtYn);
		model.addAttribute("lnbrMnnm",lnbrMnnm);
		model.addAttribute("lnbrSlno",lnbrSlno);
		model.addAttribute("emdNo",emdNo);
		return "jusoPopup2";

	}

	@Override
	@PostMapping("/Distance")
	public void distanceCalc(@RequestParam (value="sourceAddr") String sourceAddr, @RequestParam (value="destinationAddr") String destinationAddr, HttpServletResponse response) throws IOException {

		 	System.out.println("Distance");
		 	
		 	DistanceCalc dis = new DistanceCalc();
			//String addr1 = "광주광역시 광산구 하남대로261번길 27";
			//String addr2 = "강원도 원주시 호저면 중부동 1길 130" ;
			
			double result = dis.calcDistance(sourceAddr, destinationAddr);
			System.out.println("거리계산 완료 야호 :: " + result);
			
			PrintWriter out = response.getWriter();
			out.append(Double.toString(result));
			out.flush();
			out.close();

	}

	@Override
	@PostMapping("/Signup")
	public ModelAndView signup(MemberVO memberVO) throws IOException {
		ModelAndView mv = new ModelAndView();
		
		try {
			//회원가입
			service.signupMember(memberVO);
			
			//로그인하기
			mv.addObject("id",memberVO.getId());
			mv.addObject("password",memberVO.getPassword());
			mv.setViewName("redirect:./Signin");
			
		} catch (Exception e) {
			e.printStackTrace();
			mv.setViewName("error");
		}
		return mv;
	}

	@Override
	@RequestMapping("/AddAddress")
	public ModelAndView addAddress(MemberVO memberVO) throws IOException {
			ModelAndView mv = new ModelAndView();
		
				try {
					//주소록 추가
					service.registerAddress(memberVO);
					mv.addObject("section", "book");
					
					MemberVO relogin = service.searchMemberById(memberVO.getId());
					//로그인하기
					mv.addObject("id",relogin.getId());
					mv.addObject("password",relogin.getPassword());
					mv.setViewName("redirect:./Signin");

					
				} catch (Exception e) {
					e.printStackTrace();
					mv.addObject("err",e.getMessage());
					mv.setViewName("error");
				}
				return mv;
	}

	@Override
	@RequestMapping("/DeleteAddress")
	public ModelAndView DeleteAddress(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String[] ajaxMsg = request.getParameterValues("valueArr");
		
		int size = ajaxMsg.length;
		System.out.println(size);
		String id = null;
		
		try {
			for ( int i=0; i<size ; i ++ ) {
				MemberVO address = new MemberVO();  //vo객체에 담는다.
				String[] strArr = ajaxMsg[i].split("#");
				id = strArr[0];
				System.out.println(strArr[0]);
				System.out.println(strArr[1]);
				System.out.println(strArr[2]);
				address.setId(strArr[0]); //id
				address.setName(strArr[1]);//name
				address.setEmail(strArr[2]);//email
				service.deleteAddress(address);
			}
		
			MemberVO relogin = service.searchMemberById(id);
			//로그인하기
			mv.addObject("id",relogin.getId());
			mv.addObject("password",relogin.getPassword());
			mv.setViewName("redirect:./Signin");
			} catch (Exception e) {
				e.printStackTrace();
				mv.addObject("err",e.getMessage());
				mv.setViewName("error");
			}
		return mv;
	}

}
