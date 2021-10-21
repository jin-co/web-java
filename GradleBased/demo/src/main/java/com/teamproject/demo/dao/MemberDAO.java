package com.teamproject.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.teamproject.demo.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {

	public MemberVO selectMember(MemberVO mb);
	
	public void insertMember(MemberVO mb); 

	public MemberVO selectMemberById(String id);
	
}
