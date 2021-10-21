package com.teamproject.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamproject.demo.dao.HealthyDietDAO;
import com.teamproject.demo.vo.HealthyDietVO;
import com.teamproject.demo.vo.OpenApiRecomendDietVO;

@Service
public class HealthyDietServiceImpl implements HealthyDietService {
	
	@Autowired
	HealthyDietDAO dao;
		
	@Override
	public ArrayList<HealthyDietVO> searchAllHealthyDiet() {
		
		return dao.selectAllArticle();
	}

	@Override
	public HealthyDietVO searchHealthyDietById(String idx) {
		
	 System.out.println("searchHealthyDietById  idx  " + idx );
		
		return dao.selectArticleById(idx);
	}

		@Override
	public void copyHealthyDietMain(OpenApiRecomendDietVO diet) {
		dao.insertHealthyDietMain(diet);
		
	}

	@Override
	public int searchHealthyDietMaxIdx() {
		
		return dao.selectHealthyDietIdxMax();
	}

}
