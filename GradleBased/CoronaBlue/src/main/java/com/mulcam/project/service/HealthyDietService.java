package com.mulcam.project.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.mulcam.project.vo.HealthyDietVO;
import com.mulcam.project.vo.OpenApiRecomendDietVO;

@Service
public interface HealthyDietService {
		
	 public ArrayList<HealthyDietVO> searchAllHealthyDiet();
	 
	 public HealthyDietVO searchHealthyDietById(String idx);
	 

	 public void copyHealthyDietMain(OpenApiRecomendDietVO diet )	;
	 
	 public int searchHealthyDietMaxIdx();
}
