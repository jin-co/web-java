package com.mulcam.project.service;

import java.util.ArrayList;

import com.mulcam.project.vo.HiraRateVO;

public interface HiraRateService {

	public ArrayList<HiraRateVO> SearchAllAddress();
	
	public ArrayList<HiraRateVO> SearchAllPos();
	
	public void RegistPosToAddress(HiraRateVO vo);
}
