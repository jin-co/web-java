package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        Member member = new Member(1L, "TOM", Grade.VIP);
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        memberService.join(member);
        System.out.println("memberService.findMember(1L) = " + memberService.findMember(1L));
    }
}
