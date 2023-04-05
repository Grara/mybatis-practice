package com.mybatistraining;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberDAO memberDAO;

    @GetMapping("/members")
    public List<Member> findMembers(){
        return memberDAO.findAllMembers();
    }

    @GetMapping("/members2")
    public List<Member> findMembers2(){
        return memberDAO.findAllMembersJoinItems();
    }

    @GetMapping("/members3")
    public List<Member> findMembers3(){
        return memberDAO.findByname("노");
    }
}
