package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        Member member = new Member(1L, "tom", Grade.VIP);
        MemberService memberService = new MemberServiceImpl();
        memberService.join(member);
        System.out.println("memberService.getMember(1L) = " + memberService.getMember(1L));
    }
}
