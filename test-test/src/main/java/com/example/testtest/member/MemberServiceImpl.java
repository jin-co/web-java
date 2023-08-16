package com.example.testtest.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findById(id);
    }
}
