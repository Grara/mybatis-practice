package com.mybatistraining;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface MemberDAO {
    List<Member> findAllMembers();
    List<Member> findAllMembersJoinItems();
    List<Member> findByname(String name);
}
