package com.mulcam.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.board.dao.BoardDAO;
import com.mulcam.board.vo.Board;
import com.mulcam.board.vo.PageInfo;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void regBoard(Board board) throws Exception {
		int board_num = boardDAO.selectMaxBoardNum()+1;
		board.setBOARD_NUM(board_num);
		board.setBOARD_RE_REF(board_num);
		board.setBOARD_RE_LEV(0);
		board.setBOARD_RE_SEQ(0);
		board.setBOARD_READCOUNT(0);
		boardDAO.insertBoard(board);
	}

	@Override
	public List<Board> getBoardList(int page, PageInfo pageInfo) throws Exception {
		int listCount = boardDAO.selectBoardCount();
		//총 페이지 수(올림처리)
		int maxPage = (int)Math.ceil((double)listCount/10);
		//현재 페이지에 보여줄 시작 페이지 수(1,11,21,31...)
		int startPage = (((int) ((double)page/10+0.9))-1)*10+1;
		//현재 페이지에 보여줄 마지막 페이지 수(10,20,30...)
		int endPage = startPage+10-1;
		if(endPage>maxPage) endPage=maxPage;
		pageInfo.setEndPage(endPage);
		pageInfo.setListCount(listCount);
		pageInfo.setMaxPage(maxPage);
		pageInfo.setPage(page);
		pageInfo.setStartPage(startPage);
		int startrow = (page-1)*10+1;
		
		return boardDAO.selectBoardList(startrow);
	}

}
