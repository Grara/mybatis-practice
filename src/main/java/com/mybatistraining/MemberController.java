package com.mybatistraining;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @PostMapping("/test2")
    public ResponseEntity<Map<String, Object>> test2(@RequestBody Map<String, Object> map){
        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }
}
