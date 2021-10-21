package com.mulcam.semiproject.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mulcam.semiproject.dao.MemberDAO;
import com.mulcam.semiproject.vo.BookVO;
import com.mulcam.semiproject.vo.MailVO;
import com.mulcam.semiproject.vo.MemberVO;

@Service
public class MailServiceImpl implements MailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private MemberDAO dao;
		
	@Override
	public void mailSend(MailVO mailVO) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(mailVO.getMailEmail());
		message.setSubject(mailVO.getMailTitle());
		message.setText(mailVO.getMailContent());
		
		mailSender.send(message);

	}

	@Override
	public MemberVO login(MemberVO memberVO) {
		return dao.selectMemberForLogin(memberVO);
		
	}

	@Override
	public ArrayList<BookVO> searchAddressById(String id) {
		
		return dao.selectAddressById(id);
	}

	@Override
	public void signupMember(MemberVO memberVO) {
		
		dao.insertMember(memberVO);
		
		
	}

	public void registerAddress(MemberVO memberVO) {
		System.out.println("MailServiceImpl");
		System.out.println("getId " + memberVO.getId());
		System.out.println("getName "+ memberVO.getName());
		System.out.println("getEmail "+ memberVO.getEmail());
		
		
		
		dao.insertAddress(memberVO);
		
	}

	@Override
	public MemberVO searchMemberById(String id) {
		
		return dao.selectMemberById(id);
	}
	
	@Override
	public void deleteAddress(MemberVO address) {
		dao.deleteAddress(address);
		System.out.println("MailServiceImpl");
		System.out.println("getId " + address.getId());
		System.out.println("getName "+ address.getName());
		System.out.println("getEmail "+ address.getEmail());
		
	}



}
