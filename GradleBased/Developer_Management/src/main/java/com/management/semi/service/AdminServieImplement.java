package com.management.semi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.semi.dao.AdministratorDAO;
import com.management.semi.vo.Administrator;

@Service
public class AdminServieImplement implements AdminService {
	@Autowired
	AdministratorDAO adminDAO;
	
	@Override
	public void login(String id, String password) throws Exception {
		Administrator admin = adminDAO.selectAdmin(new Administrator(id, password));
		if (admin == null) throw new Exception("아이디 또는 비밀번호가 다릅니다.");
	}
}
