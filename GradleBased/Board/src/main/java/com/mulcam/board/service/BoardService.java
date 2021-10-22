package com.mulcam.board.service;

import java.util.List;

import com.mulcam.board.vo.Board;
import com.mulcam.board.vo.PageInfo;

public interface BoardService {
	void regBoard(Board board) throws Exception;
	List<Board> getBoardList(int page, PageInfo pageInfo) throws Exception;
}
