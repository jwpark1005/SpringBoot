package com.example.demo.repo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Member;

import java.util.List;

@Mapper
@Repository
public interface MemberRepository {

    List<Member> getUserList();

    int totalAccount();

    int loginCheck();

}
