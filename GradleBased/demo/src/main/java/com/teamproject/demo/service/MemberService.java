package com.teamproject.demo.service;

import com.teamproject.demo.vo.MemberVO;

public interface MemberService {
	
	MemberVO searchMember(String id, String password);
	
	MemberVO registerMember(MemberVO mb); 

}
