package sec.maru;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberApi {

    @Autowired
    private MemberService memberService;

    @GetMapping("/greeting")
    public Member greeting() {
       Member member = new Member();
       member.setUname("제노임펙트");
       member.setUserid("Xeno");
       member.setUserpwd("12345");
       return member;
    }
}
