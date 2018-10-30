package sec.maru;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;

@RestController
public class MemberApi {

    @Autowired
    MemberService memberService;
    
    public MemberApi(MemberService memberService) {
        this.memberService = memberService;
    }

    @Autowired
    LoginDAO loginDAO;

    @RequestMapping(value = "/")
    public List<Member> search() {
        return memberService.selectMemberList();
    }

    @GetMapping("/{topicNo}")
    public Member hi(@PathVariable int topicNo) {
        return memberService.MemberList();
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/login/loginCheck")
    public void loginCheck(Locale locale, Model model, Member member, HttpSession session, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        if((member.getUname() != null && !member.getUserid().equals("") && member.getUserpwd() != null) && !member.getUserpwd().equals("")){
            if(loginDAO.loginCheck(member)){
                session.setAttribute("login", 0); // 로그인 성공시 세션
                session.setAttribute("id", member.getUserid());
                out.println("<script>location.href='/hello'; </script>");
                out.flush();
                out.close();
            }
            if(loginDAO.loginCheck(member) == false){
                out.println("<script>alert('로그인 정보를 확인하세요!'); history.go(-1); </script>");
                out.flush();
                out.close();
            }
        }
    }

}
