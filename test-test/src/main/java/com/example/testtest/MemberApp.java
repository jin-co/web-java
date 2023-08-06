package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "M1", Grade.VIP);
        memberService.join(member);
        Member m1 = memberService.findMember(1L);
        System.out.println("m1 = " + m1.getName());
        System.out.println("member = " + member.getName());
    }
}
