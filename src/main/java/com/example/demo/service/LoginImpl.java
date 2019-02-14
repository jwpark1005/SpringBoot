package com.example.demo.service;

import com.example.demo.model.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.model.LoginDAO;

@Repository
public class LoginImpl implements LoginDAO {

    @Autowired
    private SqlSession sql;

    @Override
    public boolean loginCheck(Member member){
        int count = Integer.parseInt(sql.selectOne("loginCheck", member).toString()),
                totalCount = sql.selectOne("totalAccount");
        if(totalCount > 0){
            if(count > 0){
                return true;
            }else
                return false;
        }
        return false;
    }
}
