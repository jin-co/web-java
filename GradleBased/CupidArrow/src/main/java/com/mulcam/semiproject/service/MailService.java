package com.mulcam.semiproject.service;

import java.util.ArrayList;

import com.mulcam.semiproject.vo.BookVO;
import com.mulcam.semiproject.vo.MailVO;
import com.mulcam.semiproject.vo.MemberVO;

public interface MailService {
	
	public void mailSend(MailVO mailVO);
	
	public MemberVO login(MemberVO memberVO);
	
	public ArrayList<BookVO> searchAddressById(String id);
	
	public void signupMember(MemberVO memberVO);
	
	public MemberVO searchMemberById(String id);

	public void deleteAddress(MemberVO address);
}
