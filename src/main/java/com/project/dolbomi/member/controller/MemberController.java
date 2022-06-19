package com.project.dolbomi.member.controller;

import com.project.dolbomi.member.service.MemberService;
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
//    @GetMapping("idfind")
//    public void idFind(){
//
//    }

    @PostMapping("idfind")
    public String idFind(){
        return "/member/idfind";
    }

//    일반 비밀번호 찾기
//    @GetMapping("pwfind")
//    public void pwFind(){
//
//    }

    @PostMapping("pwfind")
    public String pwFind(){
        return "/member/pwfind";
    }

//    매니저 아이디 찾기
//    @GetMapping("idfind_manager")
//    public void idFindManager(){
//
//    }

    @PostMapping("idfind_manager")
    public String idFindManager(){
        return "/member/idfind_manager";
    }

//    매니저 비밀번호 찾기
//    @GetMapping("pwfind_manager")
//    public void pwFindManager(){
//
//    }

    @PostMapping("pwfind_manager")
    public String pwFindManager(){
        return "/member/pwfind_manager";
    }

//    일반 로그인
//    @GetMapping("userlogin")
//    public void userLogin(){
//
//    }

    @PostMapping("userlogin")
    public String userLogin(){
        return "/member/mainpage";
    }

//    매니저 로그인
//    @GetMapping("managerlogin")
//    public void managerLogin(){
//
//    }

    @PostMapping("managerlogin")
    public String managerLogin(){
        return "/member/mainpage";
    }

//    회원정보 변경
//    @GetMapping("profilechange")
//    public void profileChange(){
//
//    }

    @PostMapping("profilchange")
    public String profileChange(){
        return "/member/profilechange";
    }

//    비밀번호 변경
//    @GetMapping("passwordchange")
//    public void pwChange(){
//
//    }

    @PostMapping("passwordchange")
    public String pwChange(){
        return "/member/passwordchange";
    }

//    비밀번호 조회
//    @GetMapping("passwordchange")
//    public void pwInquiry(){
//
//    }

    @PostMapping("passwordchange")
    public String pwInquiry(){
        return "/member/passwordchange";
    }

}
