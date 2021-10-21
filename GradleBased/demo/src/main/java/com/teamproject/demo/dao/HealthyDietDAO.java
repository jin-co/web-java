package com.teamproject.demo.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.teamproject.demo.vo.HealthyDietVO;
import com.teamproject.demo.vo.OpenApiRecomendDietVO;

@Mapper
@Repository
public interface HealthyDietDAO {

	public ArrayList<HealthyDietVO> selectAllArticle();

	public HealthyDietVO selectArticleById(String idx);

	public int selectHealthyDietIdxMax();
	
	public void insertHealthyDietMain(OpenApiRecomendDietVO diet);

}
