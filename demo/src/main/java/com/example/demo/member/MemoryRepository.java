package com.example.demo.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryRepository implements MemberRepository {
    private static Map<Integer, Member> storage = new HashMap<>();

    @Override
    public void save(Member member) {
        storage.put(member.getId(), member);
    }

    @Override
    public Member getById(int id) {
        return storage.get(id);
    }
}
