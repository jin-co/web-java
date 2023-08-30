package com.example.testtest.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getMemberId(), member);
    }

    @Override
    public Member getById(Long memberId) {
        return store.get(memberId);
    }
}
