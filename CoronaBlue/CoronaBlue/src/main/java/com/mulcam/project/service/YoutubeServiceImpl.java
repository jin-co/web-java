package com.mulcam.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.project.dao.YoutubeDAO;
import com.mulcam.project.vo.YoutubeVO;

@Service
public class YoutubeServiceImpl implements YoutubeService {
	
	@Autowired
	YoutubeDAO dao;
	
	public void addYoutube(YoutubeVO vo) {
		
		int id = dao.selectMaxId();
		vo.setId(id+1);

		String key = vo.getUrl().substring(vo.getUrl().lastIndexOf("/")+1, vo.getUrl().length());
		vo.setKey(key);
		
		dao.insertYoutube(vo);
	}

	@Override
	public ArrayList<YoutubeVO> getAllYoutube() {
		
		return dao.selectAllYoutube();
	}

}
