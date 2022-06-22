package com.project.dolbomi.controller.manager;

import com.project.dolbomi.service.manager.ManagerService;
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
    @GetMapping("matchList")
    public void serviceList(){

    }

//    매칭 확정
//    @GetMapping("reservOk")
//    public void machingConfirm(){
//
//    }

    @PostMapping("reservOk")
    public String machingConfirm(){
        return "/manager/manager";
    }

//    예약 내역 조회
    @GetMapping("managerdetails")
    public void reservationList(){

    }

    @GetMapping("managerdetails2")
    public void reservationList2(){

    }

    @GetMapping("managerdetails3")
    public void reservationList3(){

    }

//    서비스 상태 변경(시작)
    @GetMapping("startService")
    public String serviceStart(){
        return "/manager/manager2";
    }

//    서비스 상태 변경(취소)
    @GetMapping("cancelService")
    public void serviceCancel(){
    }

//    서비스 상태 변경(종료)
    @GetMapping("endService")
    public String serviceEnd(){
        return "/manager/manager3";
    }

//    매니저 회원가입
//    @GetMapping("mjoin")
//    public void managerJoin(){
//    }

    @PostMapping("mjoin")
    public String managerJoin(){
        return "/member/mainpage";
    }

//  페이지 이동
    @GetMapping("manager")
    public void manager(){}

    @GetMapping("manager2")
    public void manager2(){}

    @GetMapping("manager3")
    public void manager3(){}

    @GetMapping("manager_rev")
    public void manager_rev(){}

    @GetMapping("manageregi")
    public void manageregi(){}

}
