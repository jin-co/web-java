package com.mulcam.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mulcam.board.vo.Board;

@Mapper
@Repository("boardDAO")
public interface BoardDAO {
	int selectMaxBoardNum() throws Exception;
	void insertBoard(Board board) throws Exception;
	int selectBoardCount() throws Exception;
	List<Board> selectBoardList(int startrow);
}
