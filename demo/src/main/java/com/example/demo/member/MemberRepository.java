package com.example.demo.member;

public interface MemberRepository {
    void save(Member member);

    Member getById(int id);
}
