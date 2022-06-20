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
//    @GetMapping("ujoin1")
//    public void join1(){
//
//    }

    @PostMapping("ujoin1")
    public String join1(){
        return "/user/regi2";
    }

//    이메일 중복검사
//    @GetMapping("emailcheck")
//    public void emailCheck(){
//
//    }

    @PostMapping("emailcheck")
    public String emailCheck(){
        return "/user/emailcheck";
    }

//    회원가입2
//    @GetMapping("ujoin2")
//    public void join2(){
//
//    }

    @PostMapping("ujoin2")
    public String join2(){
        return "/member/mainpage";
    }

//    휴대폰 인증번호 발송
//    @GetMapping("sendcode")
//    public void phoneCerti(){
//
//    }

    @PostMapping("sendcode")
    public String phoneCerti(){
        return "/user/sendcode";
    }

//    동행 서비스 예약
//    @GetMapping("reservAcc")
//    public void accReservation(){
//
//    }

    @PostMapping("reservAcc")
    public String accReservation(){
        return "/user/user_userdetails";
    }

//    돌봄 서비스 예약
//    @GetMapping("reservCare")
//    public void careReservation(){
//
//    }

    @PostMapping("reservCare")
    public String careReservation(){
        return "/user/user_userdetails";
    }

//    동행 서비스 결제
//    @GetMapping("payAcc")
//    public void accPayment(){
//
//    }

    @PostMapping("payAcc")
    public String accPayment(){
        return "/user/user_userdetails";
    }

//    돌봄 서비스 결제
//    @GetMapping("payCare")
//    public void carePayment(){
//
//    }

    @PostMapping("payCare")
    public String carePayment(){
        return "/user/user_usedetails";
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
    @GetMapping("matchingCancel")
    public void allocationCancel(){

    }

//    서비스 상태 변경(배정수락)
    @GetMapping("matchingAccept")
    public String allocationAccept(){
        return "/user/user_details2";
    }

//    서비스 상태 변경(예약취소)
    @GetMapping("reservCancel")
    public void reservationCancel(){

    }

//    전체 목록 조회
    @GetMapping("allReview")
    public void reviewList(){

    }

//    리뷰 작성
//    @GetMapping("writeReview")
//    public void reviewWrite(){
//
//    }

    @PostMapping("writeReview")
    public String reviewWrite(){
        return "/user/writeReview";
    }

//    리뷰 조회
    @GetMapping("viewReview")
    public void reviewRead(){

    }

//    리뷰 수정
//    @GetMapping("modifyReview")
//    public void reviewUpdate(){
//
//    }

    @PostMapping("modifyReview")
    public String reviewUpdate(){
        return "/user/modifyReview";
    }

//    리뷰 삭제
    @GetMapping("delReview")
    public void reviewDelete(){

    }

}
