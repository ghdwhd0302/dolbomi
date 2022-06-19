package com.project.dolbomi.manager.controller;

import com.project.dolbomi.manager.service.ManagerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/manager/*")
public class ManagerController {
    private final ManagerService managerService;

//    서비스 신청 목록
    @GetMapping("manager_rev")
    public void serviceList(){

    }

//    매칭 확정
//    @GetMapping("manager_rev")
//    public void machingConfirm(){
//
//    }

    @PostMapping("manager_rev")
    public String machingConfirm(){
        return "/manager/manager";
    }

//    예약 내역 조회
    @GetMapping("manager")
    public void reservationList(){

    }

    @GetMapping("manager2")
    public void reservationList2(){

    }

    @GetMapping("manager")
    public void reservationList3(){

    }

//    서비스 상태 변경(시작)
    @GetMapping("manager")
    public String serviceStart(){
        return "/manager/manager2";
    }

//    서비스 상태 변경(취소)
    @GetMapping("manager")
    public void serviceCancel(){
    }

//    서비스 상태 변경(종료)
    @GetMapping("manager2")
    public String serviceEnd(){
        return "/manager/manager3";
    }

//    매니저 회원가입
//    @GetMapping("manageregi")
//    public void managerJoin(){
//    }

    @PostMapping("manageregi")
    public String managerJoin(){
        return "/member/mainpage";
    }

}
