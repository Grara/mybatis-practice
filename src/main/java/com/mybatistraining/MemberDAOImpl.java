package com.mybatistraining;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberDAOImpl implements MemberDAO {

    private final SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<Member> findAllMembers() {
        return sqlSessionTemplate.selectList("com.mybatistraining.MemberDAO.findAllMembers");
    }

    @Override
    public List<Member> findAllMembersJoinItems() {
        return sqlSessionTemplate.selectList("com.mybatistraining.MemberDAO.findAllMembersJoinItems");
    }

    @Override
    public List<Member> findByname(String name) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", name);
        return sqlSessionTemplate.selectList("com.mybatistraining.MemberDAO.findByName", params);
    }
}
