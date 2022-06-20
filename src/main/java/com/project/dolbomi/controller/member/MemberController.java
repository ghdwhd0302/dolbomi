package com.project.dolbomi.controller.member;

import com.project.dolbomi.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {
    private final MemberService memberService;

//    일반 아이디 찾기
//    @GetMapping("userIdF")
//    public void idFind(){
//
//    }

    @PostMapping("userIdF")
    public String idFind(){
        return "/member/userIdF";
    }

//    일반 비밀번호 찾기
//    @GetMapping("userPwF")
//    public void pwFind(){
//
//    }

    @PostMapping("userPwF")
    public String pwFind(){
        return "/member/userPwF";
    }

//    매니저 아이디 찾기
//    @GetMapping("managerIdF")
//    public void idFindManager(){
//
//    }

    @PostMapping("managerIdF")
    public String idFindManager(){
        return "/member/managerIdF";
    }

//    매니저 비밀번호 찾기
//    @GetMapping("managerPwF")
//    public void pwFindManager(){
//
//    }

    @PostMapping("managerPwF")
    public String pwFindManager(){
        return "/member/managerPwF";
    }

//    일반 로그인
//    @GetMapping("loginU")
//    public void userLogin(){
//    }

    @PostMapping("loginU")
    public String userLogin(){
    return "/member/mainpage";
}

//    일반 회원 탈퇴
//    @GetMapping("exitU")
//    public void userExit(){
//    }

    @PostMapping("exitU")
    public String userExit(){
        return "/member/mainpage";
    }

//    매니저 로그인
//    @GetMapping("loginM")
//    public void managerLogin(){
//
//    }

    @PostMapping("loginM")
    public String managerLogin(){
        return "/member/mainpage";
    }

//   매니저 회원 탈퇴
//    @GetMapping("exitM")
//    public void managerExit(){
//
//    }

    @PostMapping("exitM")
    public String managerExit(){
        return "/member/mainpage";
    }

//    회원정보 변경
//    @GetMapping("updateInfor")
//    public void profileChange(){
//
//    }

    @PostMapping("updateInfor")
    public String profileChange(){
        return "/member/updateInfor";
    }

//    비밀번호 변경
//    @GetMapping("updatePW")
//    public void pwChange(){
//
//    }

    @PostMapping("updatePW")
    public String pwChange(){
        return "/member/updatePW";
    }

//    비밀번호 조회
//    @GetMapping("checkPw")
//    public void pwInquiry(){
//
//    }

    @PostMapping("checkPw")
    public String pwInquiry(){
        return "/member/checkPw";
    }

//    페이지 이동
    @GetMapping("introduce")
    public void introduce(){
    }

    @GetMapping("idfind")
    public void idfind(){
    }

    @GetMapping("idfind_manager")
    public void idfind_manager(){
    }

    @GetMapping("mainpage")
    public void mainpage(){
    }

    @GetMapping("userlogin")
    public void userlogin(){
    }

    @GetMapping("managerlogin")
    public void managerlogin(){
    }

    @GetMapping("faq")
    public void faq(){
    }

    @GetMapping("managerapply")
    public void managerapply(){
    }

    @GetMapping("profilechange")
    public void profilechange(){
    }

    @GetMapping("pwfind")
    public void pwfind(){
    }

    @GetMapping("pwfind_manager")
    public void pwfind_manager(){
    }





}
