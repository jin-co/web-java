package com.team.interview.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.team.interview.vo.FileVO;
import com.team.interview.vo.RCommVO;
import com.team.interview.vo.ReviewVO;

@Mapper
@Repository("reviewDAO")
public interface ReviewDAO {

  // 글쓰기
  int selectRImgNextval() throws Exception;

  void insertRImg(FileVO rImg) throws Exception;

  void insertReview(ReviewVO review) throws Exception;

  void insertReviewTemp(ReviewVO reviewTemp) throws Exception;


  // 게시판 리스트
  int selectReviewCount() throws Exception;

  List<ReviewVO> selectReviewList(int startrow) throws Exception;

  String selectNameByE(String email) throws Exception; // 안씀


  // 키워드 게시판 리스트
  int selectReviewKeyCount(String keyword) throws Exception;

  List<ReviewVO> selectReviewKeyList(@Param("startrow") int startrow,
      @Param("keyword") String keyword) throws Exception;


  // 임시저장 게시판 리스트
  int selectRTempCount(ReviewVO review) throws Exception;

  List<ReviewVO> selectRTempList(@Param("startrow") int startrow, @Param("reviewId") int reviewId,
      @Param("email") String email) throws Exception;


  // 공개 게시글 상세
  void updateViewCount(int reviewId) throws Exception;

  ReviewVO selectReview(int reviewId) throws Exception;

  // 이전 게시글 상세
  void updateViewCountPre(int reviewId) throws Exception;

  int selectReviewPre(int reviewId) throws Exception;

  // 다음 게시글 상세
  void updateViewCountNext(int reviewId) throws Exception;

  int selectReviewNext(int reviewId) throws Exception;



  // 게시글 상세 - 첨부파일

  FileVO getFile(int fileId) throws Exception;

  // 게시글 상세 - 프로필

  int selectPfId(String email) throws Exception;

  FileVO getPfImg(int pfId) throws Exception;

  // 게시글 상세 - 좋아요

  int selectLikeCount(String reviewId) throws Exception;

  void updateLikeCount(String reviewId) throws Exception;


  // 게시글 수정
  void updateReview(ReviewVO review) throws Exception;

  void updateRImg(FileVO rImg) throws Exception;

  void updateLikeCount(int reviewId) throws Exception;

  // 게시글 삭제
  void deleteReview(int reviewId) throws Exception;



  // 댓글기능

  // insert 본댓글
  void insertRComm(RCommVO rComm) throws Exception;

  // update 댓글수 (게시글 넘버)
  void updateCommCnt(int reviewId) throws Exception;

  // 대댓글 사전작업 selectSeqMax
  int selectSeqMax(@Param("prtComId") int prtComId) throws Exception;

  // insert 대댓글
  void insertRCommChild(RCommVO rComm) throws Exception;

  // select댓글List
  List<RCommVO> selectRCommList(int reviewId) throws Exception;


  // select 댓글작성자 프로필사진
  FileVO getCommImg(String email) throws Exception;

  // 댓글 전체삭제
  void deleteRCommTotal(int reviewId) throws Exception;

  // 댓글 삭제
  void deleteRComm(int comId) throws Exception;
}
