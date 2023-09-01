package com.example.testtest.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryRepository implements MemberRepository{
    private static Map<Long, Member> storage = new HashMap<>();
    @Override
    public void save(Member member) {
        storage.put(member.getMemberId(), member);
    }

    @Override
    public Member findById(Long id) {
        return storage.get(id);
    }
}
