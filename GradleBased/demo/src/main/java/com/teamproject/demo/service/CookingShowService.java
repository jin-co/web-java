package com.teamproject.demo.service;

import java.util.List;

import com.teamproject.demo.vo.CookingShowCommentsVO;
import com.teamproject.demo.vo.CookingShowDetailVO;
import com.teamproject.demo.vo.CookingShowVO;

public interface CookingShowService {

	List<CookingShowVO> searchAllArticle();

	void addRecommendation(String articleId);

	String searchRecommendation(String articleId);

	CookingShowVO searchCookingShowById(String articleId);

	List<CookingShowDetailVO> searchCookingShowDetailById(String articleId);

	List<CookingShowCommentsVO> searchCookingShowCommentsById(String articleId);

	void addCookingShowComments(CookingShowCommentsVO csc);

	int searchCurrentIdx();

	void addCookingShowMain(CookingShowVO cs);

	void addCookingShowDetail(CookingShowVO cs);

}
