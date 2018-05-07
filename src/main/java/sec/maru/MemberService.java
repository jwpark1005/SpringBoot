package sec.maru;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> selectMemberList(){
        return memberRepository.getUserList();
    }

//    public boolean loginCheck(Member member) {
//        int count = Integer.parseInt(memberRepository.userCheck().toString());
//        int totalCount = memberRepository.totalAccount();
//
//        if(totalCount > 0){
//            if(count > 0){
//                return true;
//            } else
//                return false;
//        }
//        return false;
//    }

    public Member MemberList(){
        Member member = new Member();
        member.setUname("제노임펙트");
        member.setUserid("Xeno");
        member.setUserpwd("1234");
        return member;
    }
}