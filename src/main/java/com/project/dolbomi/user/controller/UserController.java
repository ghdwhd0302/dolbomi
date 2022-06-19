package com.project.dolbomi.user.controller;

import com.project.dolbomi.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user/*")
public class UserController {
    private final UserService userService;

//    회원가입1
//    @GetMapping("regi1")
//    public void join1(){
//
//    }

    @PostMapping("regi1")
    public String join1(){
        return "/user/regi2";
    }

//    이메일 중복검사
//    @GetMapping("regi1")
//    public void emailCheck(){
//
//    }

    @PostMapping("regi1")
    public String emailCheck(){
        return "/user/regi1";
    }

//    회원가입2
//    @GetMapping("regi2")
//    public void join2(){
//
//    }

    @PostMapping("regi2")
    public String join2(){
        return "/member/mainpage";
    }

//    휴대폰 인증번호 발송
//    @GetMapping("regi2")
//    public void phoneCerti(){
//
//    }

    @PostMapping("regi2")
    public String phoneCerti(){
        return "/user/regi2";
    }

//    동행 서비스 예약
//    @GetMapping("acc_reservation3")
//    public void accReservation(){
//
//    }

    @PostMapping("acc_reservation3")
    public String accReservation(){
        return "/user/user_userdetails";
    }
//    돌봄 서비스 예약
//    @GetMapping("care_reservation3")
//    public void careReservation(){
//
//    }

    @PostMapping("care_reservation3")
    public String careReservation(){
        return "/user/user_userdetails";
    }

//    동행 서비스 결제
//    @GetMapping("acc_reservation3")
//    public void accPayment(){
//
//    }

    @PostMapping("acc_reservation3")
    public String accPayment(){
        return "/user/user_userdetails";
    }

//    돌봄 서비스 결제
//    @GetMapping("care_reservation3")
//    public void carePayment(){
//
//    }

    @PostMapping("care_reservation3")
    public String carePayment(){
        return "/user/user_usedetail";
    }

//    예약 내역 조회
    @GetMapping("user_userdetails")
    public void reservationList(){

    }
    @GetMapping("user_userdetails2")
    public void reservationList2(){

    }
    @GetMapping("user_userdetails3")
    public void reservationList3(){

    }
    @GetMapping("user_userdetails4")
    public void reservationList4(){

    }

//    서비스 상태 변경(배정취소)
    @GetMapping("user_userdetails")
    public void allocationCancel(){

    }
//    서비스 상태 변경(배정수락)
    @GetMapping("user_userdetails")
    public String allocationAccept(){
        return "/user/user_details2";
    }
//    서비스 상태 변경(예약취소)
    @GetMapping("user_userdetails2")
    public void reservationCancel(){

    }

//    전체 목록 조회
    @GetMapping("review")
    public void reviewList(){

    }

//    리뷰 작성
//    @GetMapping("review")
//    public void reviewWrite(){
//
//    }

    @PostMapping("review")
    public String reviewWrite(){
        return "/user/review";
    }

//    리뷰 조회
    @GetMapping("review")
    public void reviewRead(){

    }

//    리뷰 수정
//    @GetMapping("review")
//    public void reviewUpdate(){
//
//    }

    @PostMapping("review")
    public String reviewUpdate(){
        return "/user/review";
    }
//    리뷰 삭제
    @GetMapping("review")
    public void reviewDelete(){

    }

}
