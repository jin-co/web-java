package com.mulcam.project.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mulcam.project.vo.YoutubeVO;

@Mapper
@Repository
public interface YoutubeDAO {
	
	public void insertYoutube(YoutubeVO vo);
	
	public int selectMaxId();
	
	public ArrayList<YoutubeVO> selectAllYoutube();

}
