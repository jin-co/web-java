package com.example.test;

import com.example.test.member.Grade;
import com.example.test.member.Member;
import com.example.test.member.MemberService;
import com.example.test.member.MemberServiceImpl;

import java.util.Arrays;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "A", Grade.VIP);
        memberService.join(member);
        Member member1 = memberService.findMember(1L);
        System.out.println("member1 = " + member1.getName());
        System.out.println("args = " + member.getName());
    }
}
