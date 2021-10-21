package com.teamproject.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.teamproject.demo.vo.CookingShowCommentsVO;
import com.teamproject.demo.vo.CookingShowDetailVO;
import com.teamproject.demo.vo.CookingShowReasonsVO;
import com.teamproject.demo.vo.CookingShowVO;

@Mapper
@Repository("cookingShowDAO")
public interface CookingShowDAO {

	public List<CookingShowVO> selectAllArticle();

	public void updateRecommendation(String articleId);

	public String selectRecommendationById(String articleId);

	public CookingShowVO selectArticleById(String articleId);

	public List<CookingShowDetailVO> selectArticleDetailById(String articleId);

	public List<CookingShowCommentsVO> selectArticleCommentsById(String articleId);

	public void insertComments(CookingShowCommentsVO csc);

	public void insertArticleMain(CookingShowVO cs);

	public void insertArticleDetail(CookingShowReasonsVO csr);

	public int selectMaxIdx();
}
