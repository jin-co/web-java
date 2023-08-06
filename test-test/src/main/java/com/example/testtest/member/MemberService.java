package com.example.testtest.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long id);
}
