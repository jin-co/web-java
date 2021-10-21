package com.teamproject.demo.controller;

import java.io.File;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.teamproject.demo.service.CookingShowServiceImpl;
import com.teamproject.demo.vo.CookingShowCommentsVO;
import com.teamproject.demo.vo.CookingShowDetailVO;
import com.teamproject.demo.vo.CookingShowVO;

@Controller
public class CookingShowController {

	@Autowired
	CookingShowServiceImpl service;

	// 요리자랑 목록 페이지 
	@RequestMapping(value = "/CookingShow", method = RequestMethod.GET)
	ModelAndView cookingshow() throws Exception {

		ModelAndView modelAndView = new ModelAndView();

		System.out.println("CookingShowController start");

		List<CookingShowVO> csList = null;

		try {
			csList = service.searchAllArticle();

			modelAndView.addObject("csList", csList);

		} catch (Exception e) {

			modelAndView.addObject("err", "오류 발생");

			modelAndView.setViewName("error");
		}

		// 받아온 게시글 리스트를 항목별로 반복해서 출력
		for (CookingShowVO cs : csList) {
			System.out.println("CookingShowVO idx " + cs.getIdx());
			System.out.println("CookingShowVO author_id " + cs.getAuthorid());
			System.out.println("CookingShowVO title " + cs.getTitle());
			System.out.println("CookingShowVO category_id " + cs.getCategoryid());
			System.out.println("CookingShowVO contents " + cs.getContents());
			System.out.println("CookingShowVO image_url " + cs.getImageurl());
			System.out.println("CookingShowVO recommendation " + cs.getRecommendation());
			System.out.println("CookingShowVO post_date " + cs.getPostdate());
			System.out.println("CookingShowVO modify_date " + cs.getModifydate());
		}
		System.out.println("CookingShowController end");
		modelAndView.addObject("csList", csList);
		modelAndView.setViewName("cookingshow");

		return modelAndView;
	}

	// 요리 자랑 상세 페이지 ( 목록페이지 > 상세페이지 )
	@RequestMapping(value = "/CookingShowDetail", method = RequestMethod.GET)
	ModelAndView cookingshow_detail(@RequestParam(value = "idx", required = true) String idx,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("cookingshow_detail start" + idx);

		try {

			// 게시글 정보 가져오기
			CookingShowVO cs = service.searchCookingShowById(idx);

			// 본문 추천이유 가져오기
			List<CookingShowDetailVO> csdList = service.searchCookingShowDetailById(idx);

			// 커멘트 가져오기
			List<CookingShowCommentsVO> cscList = service.searchCookingShowCommentsById(idx);

			modelAndView.addObject("cs", cs);

			modelAndView.addObject("csdList", csdList);

			modelAndView.addObject("cscList", cscList);

			modelAndView.setViewName("cookingshow_detail");

		} catch (Exception e) {
			e.printStackTrace();
			
			modelAndView.addObject("err", "오류 발생");

			modelAndView.setViewName("error");
		}
		return modelAndView;
	}

	// 요리 자랑 상세 페이지 하단 댓글달기 (목록 페이지 > 상세페이지 = 댓글달기 )
	@RequestMapping(value = "/addCookingShowComments", method = RequestMethod.POST)
	ModelAndView addCookingShowComments(@ModelAttribute("csc") CookingShowCommentsVO csc) throws Exception {

		System.out.println("addCookingShowComments start");
		ModelAndView modelAndView = new ModelAndView();

		try {
			service.addCookingShowComments(csc);
			modelAndView.addObject("csc", csc);
			modelAndView.setViewName("redirect:./CookingShowDetail?idx=" + csc.getIdx());

		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.addObject("err", "오류 발생");
			modelAndView.setViewName("error");

		}
		return modelAndView;
	}
	
	
	// 요리 자랑 	글 게시하기 링크 	
	@RequestMapping(value="/addCookingShowArticle", method = RequestMethod.GET)
    public String addCookingShowArticle() throws Exception {
    	
    	return "addCookingShow";
    }
    
	// 요리 자랑 글 게시하기 (submit)
	@RequestMapping(value = "/addCookingShowArticle", method = RequestMethod.POST)
	ModelAndView addCookingShowArticle(@ModelAttribute CookingShowVO cs, AbstractMultipartHttpServletRequest multi) throws Exception {
		
		System.out.println("addCookingShowArticle start");
		
		ModelAndView modelAndView = new ModelAndView();

		// 게시글의 마지막 index 번호를 조회해 온다.
		int currentIdx = service.searchCurrentIdx();

		cs.setIdx(currentIdx+1);

		// 추천 이유 리슽트에 게시글 번호와 추천이유 인덱스 번호 추가

		for (int i = 0; i < cs.getReasonsVOList().size() ; i++) {
			cs.getReasonsVOList().get(i).setIdx(currentIdx+1);
			cs.getReasonsVOList().get(i).setRidx(i + 1);
		}
		
		// 

		try {
			
			
			// 1. 이미지파일 서버 업로드 처리
			//서버 업로드 폴더의 실제경로 구하기 (static path 로 변경)
				//String path = multi.getServletContext().getRealPath("/images/");
			     String path = new File("src\\main\\resources\\static\\uploads\\cookingshow").getAbsolutePath();
			     System.out.println(path);
			//클라이언트에서 가져온 파일구하기
			MultipartFile originfile = multi.getFile("file");

			//서버에 저장할 파일 생성하기
			File destFile = new File(path+originfile.getOriginalFilename());

			//클라이언트 파일을 서버 파일에 옮기기
			originfile.transferTo(destFile);
			
			// 2. 업로드된 이미지파일 경로 DB table update
			System.out.println("filename "+ originfile.getOriginalFilename());
			
			String imageFile = "./uploads/cookingshow/"+originfile.getOriginalFilename();
			System.out.println(imageFile);
			
			cs.setImageurl(imageFile);
			
			// 3. 게시글 메인 먼저 입력
			service.addCookingShowMain(cs);

			// 4. 게시글 상세 나중에 입력
			service.addCookingShowDetail(cs);

			modelAndView.setViewName("redirect:./CookingShow");

		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.addObject("err", "오류 발생");
			modelAndView.setViewName("error");

		}

		return modelAndView;
	}

	// 요리 자랑 추천하기 ( 목록 페이지 및 상세페이지, ajax 처리)	
	@RequestMapping(value = "/CookingShowRecommendation", method = RequestMethod.GET)
	void cookignshowrecommendation(@RequestParam(value = "idx", required = true) String idx,
			HttpServletResponse response) throws Exception {

		service.addRecommendation(idx);

		String recommendationCnt = service.searchRecommendation(idx);

		PrintWriter out = response.getWriter();

		DecimalFormat decFormat = new DecimalFormat("###,###");

		String recommendationCntStr = decFormat.format(Integer.parseInt(recommendationCnt));

		out.append(recommendationCntStr);

		out.flush();
		out.close();
		System.out.println("CookingShowRecommendation start" + idx);

	}

}
