package com.mulcam.project.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mulcam.project.vo.HiraRateVO;

@Mapper
@Repository
public interface HiraRateDAO {
	
	public ArrayList<HiraRateVO> selectAllAddress();
	
	public ArrayList<HiraRateVO> selectAllPos();

	public void updatePosToAddress(HiraRateVO vo);

}
