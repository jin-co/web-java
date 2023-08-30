package com.example.testtest.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member getMember(Long memberId) {
        return memberRepository.getById(memberId);
    }
}
