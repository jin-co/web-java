package com.example.testtest.member;

import com.example.testtest.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberServiceImpl implements MemberService {
    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    private final MemberRepository memberRepository = ac.getBean("memberRepository", MemberRepository.class);

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member getMember(Long id) {
        return memberRepository.findById(id);
    }
}
