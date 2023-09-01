package com.example.testtest;

import com.example.testtest.member.Grade;
import com.example.testtest.member.Member;
import com.example.testtest.member.MemberService;
import com.example.testtest.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberAppTest {
    MemberService memberService = new MemberServiceImpl();
    Member member = new Member(1L, "tom", Grade.VIP);

    @Test
    void getMember() {
        memberService.join(member);
        Member member1 = memberService.getMember(1L);
        Assertions.assertThat(member1).isEqualTo(member);
    }
}