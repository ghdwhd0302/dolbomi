package com.project.dolbomi.controller.user;
import com.project.dolbomi.domain.vo.UserVO;
import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.CareReservationVO;
import com.project.dolbomi.service.member.MemberService;
import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.PageDTO;
import com.project.dolbomi.domain.vo.ReviewVO;

import com.project.dolbomi.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import javax.servlet.http.HttpServletRequest;


@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user/*")
public class UserController {
    private final MemberService memberService;
    private final UserService userService;

//    회원가입1
//    @GetMapping("ujoin1")
//    public void join1(){
//
//    }

    @PostMapping("regi1")
    public String join1(UserVO userVO){
        log.info("---------------------------------------");
        log.info("join1............. : " + userVO);
        log.info("---------------------------------------");

        userService.join(userVO);
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

    @PostMapping("regi2")
    public String join2(UserVO userVO){
        log.info("---------------------------------------");
        log.info("join1............. : " + userVO);
        log.info("---------------------------------------");

        userService.join(userVO);
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

//    동행 서비스 예약 1단계
    @PostMapping("acc_reservation2")
    public void acc_reserv1(AccReservationVO accReservationVO, Model model){

        log.info("accReservationVO..........." + accReservationVO);

        model.addAttribute("accReservationVO", accReservationVO);
    };

//    동행 서비스 예약 2단계
    @PostMapping("acc_reservation3")
    public void acc_reserv2(AccReservationVO accReservationVO, Model model){
        log.info("accReservationVO..........." + accReservationVO);

        model.addAttribute("accReservationVO", accReservationVO);
    }

//    동행 서비스 예약 완료단계
    @PostMapping("reservAcc")
    public RedirectView accReservation(AccReservationVO accReservationVO){
        accReservationVO.setUserEmail("APPLE");
        log.info("accReservationVO..........." + accReservationVO);
        memberService.accReservation(accReservationVO);

        return new RedirectView("/user/acc_confirmation");
    }

//    돌봄 서비스 예약
//    @GetMapping("reservCare")
//    public void careReservation(){
//
//    }

    //    돌봄 서비스 예약 1단계
    @PostMapping("care_reservation2")
    public void care_reserv1(CareReservationVO careReservationVO, Model model){

        log.info("careReservationVO..........." + careReservationVO);

        model.addAttribute("careReservationVO", careReservationVO);
    };

    //    돌봄 서비스 예약 2단계
    @PostMapping("care_reservation3")
    public void care_reserv2(CareReservationVO careReservationVO, Model model){
        log.info("careReservationVO..........." + careReservationVO);

        model.addAttribute("careReservationVO", careReservationVO);
    }

    //    돌봄 서비스 예약 완료단계
    @PostMapping("reservCare")
    public RedirectView careReservation(CareReservationVO careReservationVO) {
        careReservationVO.setUserEmail("APPLE");
        log.info("careReservationVO..........." + careReservationVO);
        memberService.careReservation(careReservationVO);

        return new RedirectView("/user/care_confirmation");
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
//    @GetMapping("user_userdetails")
//    public void reservationList(){
//
//    }
//    @GetMapping("user_userdetails2")
//    public void reservationList2(){
//
//    }
//    @GetMapping("user_userdetails3")
//    public void reservationList3(){
//
//    }
//    @GetMapping("user_userdetails4")
//    public void reservationList4(){
//
//    }

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

//    페이지 이동
    @GetMapping("acc_reservation1")
    public void acc_reservation1(){}

    @GetMapping("acc_reservation2")
    public void acc_reservation2(){}

    @GetMapping("acc_reservation3")
    public void acc_reservation3(){}

    @GetMapping("acc_confirmation")
    public void acc_confirmation(){}

    @GetMapping("care_reservation1")
    public void care_reservation1(){}

    @GetMapping("care_reservation2")
    public void care_reservation2(){}

    @GetMapping("care_reservation3")
    public void care_reservation3(){}

    @GetMapping("care_confirmation")
    public void care_confirmation(){}

    @GetMapping("option_reservation")
    public void option_reservation(){}

    @GetMapping("regi1")
    public void regi1(){}

    @GetMapping("regi2")
    public void regi2(){}

    @GetMapping("user_userdetails")
    public void user_userdetails(){}

    @GetMapping("user_userdetails2")
    public void user_userdetails2(){}

    @GetMapping("user_userdetails3")
    public void user_userdetails3(){}

    @GetMapping("user_userdetails4")
    public String user_userdetails4(Criteria criteria, Model model){
        model.addAttribute("histoyryList", userService.getList(criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, userService.getTotal()));
        return "/user/user_userdetails4";
    }

    @GetMapping("review2")
    public void register(){}

    @GetMapping("myReview")
    public void myReview(){}

    @GetMapping("review")
    public String reviewGetList(Model model){
        log.info("---------------------");
        log.info("reviewGetList--------");
        log.info("---------------------");

        model.addAttribute("reviewList", userService.reviewGetList());
        return "/user/review";
    }

    // 게시글 추가
    @PostMapping("review2")
    public RedirectView register(ReviewVO reviewVO, RedirectAttributes rttr){
        log.info("----------------------------");
        log.info("register............. : " + reviewVO);
        log.info("----------------------------");

        userService.register(reviewVO);
        rttr.addFlashAttribute("boardNumber", reviewVO.getReviewNum());
        return new RedirectView("/user/myReview");
    }

    //    게시글 상세보기
    @GetMapping({"readReview", "modifyreview"})
    public void readReview(Long reviewNum, HttpServletRequest req, Model model){
        log.info("----------------------------");
        log.info(req.getRequestURI() + "............. : " + reviewNum);
        log.info("----------------------------");
        model.addAttribute("reviewNum", userService.get(reviewNum));
    }

    // 수정
    @PostMapping("modifyReview")
    public RedirectView modifyReview(ReviewVO reviewVO, RedirectAttributes rttr) {
        log.info("----------------------------");
        log.info("modifyReview............. : " + reviewVO);
        log.info("----------------------------");
        userService.modify(reviewVO);
        rttr.addAttribute("reviewNum", reviewVO.getReviewNum());
        return new RedirectView("/board/readReview");


    }


    @GetMapping("reviewRemove")
    public String reviewRemove(Long reviewNum, Model model){
        log.info("----------------------------");
        log.info("reviewRemove............. : " + reviewNum);
        log.info("----------------------------");

        userService.reviewRemove(reviewNum);
        return reviewGetList(model);
    }

}
