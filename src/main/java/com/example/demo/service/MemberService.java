package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    public MemberService() {
    }
    
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> selectMemberList(){
        return memberRepository.getUserList();
    }

    public Member MemberList(){
        Member member = new Member();
        member.setUname("제노임펙트");
        member.setUserid("Xeno");
        member.setUserpwd("1234");
        return member;
    }
}
