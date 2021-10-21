package com.mulcam.project.service;

import java.util.ArrayList;

import com.mulcam.project.vo.YoutubeVO;

public interface YoutubeService {
	
	public void addYoutube(YoutubeVO vo);
	
	public ArrayList<YoutubeVO> getAllYoutube();

}
