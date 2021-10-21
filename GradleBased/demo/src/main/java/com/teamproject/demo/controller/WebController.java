package com.teamproject.demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.teamproject.demo.service.CookingShowServiceImpl;
import com.teamproject.demo.service.HealthyDietServiceImpl;
import com.teamproject.demo.vo.CookingShowVO;
import com.teamproject.demo.vo.HealthyDietVO;

@Controller
public class WebController {

	
	@Autowired
	HealthyDietServiceImpl serviceHD;
	@Autowired
	CookingShowServiceImpl serviceCS;

	/**
     * Jsp 호출 
     * @param 
     * @return
     * @throws Exception
     */

	//메인 페이지 - 랜덤 1개 불러오기
			// idx의 max를 불러와 random 함수를 돌린다.
	@GetMapping("/")
	public ModelAndView healthydietrandom() {
		ModelAndView mav = new ModelAndView();
		
		System.out.println("건강식단 1개 불러오기");
		
		//건강식단 1개 불러오기
		Random random = new Random();
		
		int currentIdxHD = serviceHD.searchHealthyDietMaxIdx();
		int targetIdxHD = random.nextInt(currentIdxHD)+1;
		System.out.println("HealthyDietRandom targetIdx " + targetIdxHD);
		
		HealthyDietVO randomIdxHD = serviceHD.searchHealthyDietById(Integer.toString(targetIdxHD));
	    mav.addObject("randomIdxHD", randomIdxHD);
	    
	    System.out.println("추천메뉴 1개 불러오기");
	    
	    //추천메뉴 1개 불러오기
	    int currentIdxCS = serviceCS.searchCurrentIdx();
	    int targetIdxCS = random.nextInt(currentIdxCS)+1;
	    System.out.println("HealthyDietRandom targetIdxCS " + targetIdxCS);
	    
	    CookingShowVO randomIdxCS = serviceCS.searchCookingShowById(Integer.toString(targetIdxCS));
	    mav.addObject("randomIdxCS", randomIdxCS) ;
	    mav.setViewName("index");
		return mav;
	}
		
		
		
		//메인페이지 - 최신글 6개 불러오기
			// order by posted desc	
		
    
    @RequestMapping("/info")
    public String info() throws Exception {
        return "readme";
    }

    
    @RequestMapping("/CheckOut")
    public String checkout() throws Exception {
        return "checkout";
           
    }
    
    @RequestMapping("/RegularOrder")
    public String regularorder() throws Exception {
        return "regularorder";
           
    }
    
    
    //@ResponseBody 어노테이션을 이용시 @RestController 처럼 데이터 형태로 결과를 반환
    @RequestMapping("/thisworld")
    public @ResponseBody String abcd2() throws Exception {
        return "thisworld";
    }
    
    
	/**
	
	 * html 호출 테스트
	 * @param model
	 * @return
	 * @throws Exception
	 */
	
@RequestMapping("/bootstrap-album.do")
	
	public String album(Model model) throws Exception {
	    model.addAttribute("greeting", "Hello Thymeleaf!");
	return "thymeleaf/album/index";
	
	}
	
	@RequestMapping("/bootstrap-blog.do")
	
	public String blog(Model model) throws Exception {
	    model.addAttribute("greeting", "Hello Thymeleaf!");
	return "thymeleaf/blog/index";
	
	}
	
	@RequestMapping("/bootstrap-carousel.do")
	            
	public String carousel(Model model) throws Exception {
	    model.addAttribute("greeting", "Hello Thymeleaf!");
	return "thymeleaf/carousel/index";
	
	}
	
	@RequestMapping("/bootstrap-dashboard.do")
	
	public String dashboard(Model model) throws Exception {
	    model.addAttribute("greeting", "Hello Thymeleaf!");
	return "thymeleaf/dashboard/index";
	
	}
	
	@RequestMapping("/bootstrap-grid.do")
	
	public String grid(Model model) throws Exception {
	    model.addAttribute("greeting", "Hello Thymeleaf!");
	return "thymeleaf/grid/index";
	
	}
	
	@RequestMapping("/bootstrap-masonry.do")
	
	public String masonry(Model model) throws Exception {
	    model.addAttribute("greeting", "Hello Thymeleaf!");
	return "thymeleaf/masonry/index";
	
	}
	
@RequestMapping("/bootstrap-jumbotron.do")
	
	public String jumbotron(Model model) throws Exception {
	    model.addAttribute("greeting", "Hello Thymeleaf!");
	return "thymeleaf/jumbotron/index";
	
	}

}

