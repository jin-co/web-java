package com.mulcam.semiproject.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mulcam.semiproject.vo.BookVO;
import com.mulcam.semiproject.vo.MemberVO;

@Mapper
@Repository
public interface MemberDAO {
	
	public MemberVO selectMemberForLogin(MemberVO memberVO);
	
	public ArrayList<BookVO> selectAddressById(String id);

	public void insertMember(MemberVO memberVO);

	public void insertAddress(MemberVO memberVO);

	public MemberVO selectMemberById(String id);

	public void deleteAddress(MemberVO address);

}
