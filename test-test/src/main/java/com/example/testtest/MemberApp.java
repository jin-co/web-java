package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "Tam", Grade.VIP);
        memberService.join(member);
        System.out.println("memberService.findMember(1L) = " + memberService.findMember(1L));
    }
}
