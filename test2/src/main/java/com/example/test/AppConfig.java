package com.example.test;

import com.example.test.member.MemberService;
import com.example.test.member.MemberServiceImpl;
import com.example.test.member.MemoryMemberRepository;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
}
