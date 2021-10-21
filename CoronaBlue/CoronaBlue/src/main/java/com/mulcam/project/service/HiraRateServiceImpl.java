package com.mulcam.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.project.dao.HiraRateDAO;
import com.mulcam.project.vo.HiraRateVO;



@Service
public class HiraRateServiceImpl implements HiraRateService {
	
	@Autowired
	HiraRateDAO dao;
	
	@Override
	public ArrayList<HiraRateVO> SearchAllAddress() {
		return dao.selectAllAddress();
	}
	
	@Override
	public ArrayList<HiraRateVO> SearchAllPos() {
		return dao.selectAllPos();
	}

	@Override
	public void RegistPosToAddress(HiraRateVO vo) {
		dao.updatePosToAddress(vo);
		
	}

}
