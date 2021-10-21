package com.mulcam.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.project.dao.DepressionInventoryDAO;
import com.mulcam.project.vo.DepressionInventoryVO;

@Service
public class DepressionInventoryServiceImpl implements DepressionInventoryService {

	@Autowired
	DepressionInventoryDAO diDAO;

	@Override
	public ArrayList<DepressionInventoryVO> getAllQuestions() {
		
		return diDAO.selectAllQuestions();
	}
}
