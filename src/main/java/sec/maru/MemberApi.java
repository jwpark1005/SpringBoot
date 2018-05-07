package sec.maru;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberApi {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/")
    public List<Member> greeting() {
//        Member member = new Member();
//        member.setUname("제노임펙트");
//        member.setUserid("Xeno");
//        member.setUserpwd("12345");
        return memberService.selectMemberList();
    }
}
