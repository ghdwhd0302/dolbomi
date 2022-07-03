package com.project.dolbomi.controller.user;
import com.project.dolbomi.domain.vo.*;
import com.project.dolbomi.service.member.MemberService;

import com.project.dolbomi.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("regi1")
    public String join1(UserVO userVO, Model model){
        log.info("---------------------------------------");
        log.info("join1............. : " + userVO);
        log.info("---------------------------------------");

        model.addAttribute("userVO", userVO);
        return "/user/regi2";
    }

    //    이메일 중복검사
    @PostMapping("emailcheck")
    @ResponseBody
    public int emailCheck(@RequestParam("userEmail") String userEmail){
        int cnt = userService.emailCheck(userEmail);
        return cnt;
    }

    //    회원가입2
    @PostMapping("regi2")
    public String join2(UserVO userVO){
        log.info("---------------------------------------");
        log.info("join2............. : " + userVO);
        log.info("---------------------------------------");

        userService.join(userVO);
        return "/member/userlogin";
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
    }

    //    동행 서비스 예약 2단계
    @PostMapping("acc_reservation3")
    public void acc_reserv2(AccReservationVO accReservationVO, Model model){
        log.info("accReservationVO..........." + accReservationVO);

        model.addAttribute("accReservationVO", accReservationVO);
    }

    //    동행 서비스 예약 완료단계
    @PostMapping("reservAcc")
    public RedirectView accReservation(AccReservationVO accReservationVO){
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
    }

    //    돌봄 서비스 예약 2단계
    @PostMapping("care_reservation3")
    public void care_reserv2(CareReservationVO careReservationVO, Model model){
        log.info("careReservationVO..........." + careReservationVO);

        model.addAttribute("careReservationVO", careReservationVO);
    }

    //    돌봄 서비스 예약 완료단계
    @PostMapping("reservCare")
    public RedirectView careReservation(CareReservationVO careReservationVO) {
        log.info("careReservationVO..........." + careReservationVO);
        memberService.careReservation(careReservationVO);

        return new RedirectView("/user/care_confirmation");
    }

//    동행 서비스 결제
//    @GetMapping("payAcc")
//    public void accPayment(){
//
//    }

/*
    @PostMapping("payAcc")
    public String accPayment(){
        return "/user/user_userdetails";
    }
*/

//    돌봄 서비스 결제
//    @GetMapping("payCare")
//    public void carePayment(){
//
//    }


    @PostMapping("payCare")
    public String carePayment(){
        return "/user/user_usedetails";
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
    public void user_userdetails(String Manageremail,Long accReservationNum,Long careReservationNum, Model model){

        accReservationNum=Long.valueOf(7);
        Manageremail="매니저1@naver.com";
        log.info(" accReservationNum............. : " + accReservationNum);
        if( userService.AccGetList(accReservationNum)  ){

            model.addAttribute("accreservationlist", userService.accSelect(accReservationNum));
        }
        model.addAttribute("accreservationlist", userService.accSelect(accReservationNum));
        model.addAttribute("managerInfo", managerService.managerInfo(Manageremail));
        model.addAttribute("carereservationlist", memberService.CareGetList(careReservationNum));

    }
    /* user_userdetails 의  매니저 수락*/
    @PostMapping("matchingAccept")
    public String matchingAccept(AccReservationVO accReservationVO,String Manageremail,Long accReservationNum,Long careReservationNum,Model model){

        /*accReservationNum=Long.valueOf(26);
        Manageremail="매니저1@naver.com";*/

        /*accReservationVO.setManagerEmail(Manageremail);
        accReservationVO.setAccReservationStatus("2");*/
        /*userService.accApprove(Long.valueOf(accReservationNum));*/
        /*userService.accSelect(Long.valueOf(accReservationNum));*/
        log.info("----------------------------");
        log.info("accReservationNum............. : " + accReservationNum );
        log.info("Manageremail............. : " + Manageremail );
        log.info(userService.accSelect(Long.valueOf(accReservationNum)).toString());


        log.info("----------------------------");
        /*model.addAttribute("accreservationlist",userService.accApprove(accReservationVO));
        log.info("............. : " + userService.accSelect(accReservationNum) );
        log.info("----------------------------");*/
        return "user/user_userdetails2";
    }
    /* user_userdetails 의  매니저 거절*/
    @PostMapping("managerrefuse")
    public void managerrefuse(){
        log.info("----------------------------");
        log.info("----------------------------");


    }
    @GetMapping("user_userdetails2")
    public void user_userdetails2(String Manageremail,Long accReservationNum,Long careReservationNum, Model model){
        accReservationNum=Long.valueOf(7);
        Manageremail="매니저1@naver.com";
        model.addAttribute("accreservationlist", userService.accSelect(accReservationNum));
        model.addAttribute("managerInfo", managerService.managerInfo(Manageremail));
    }

    @GetMapping("user_userdetails3")
    public void user_userdetails3(String Manageremail,Long accReservationNum,Long careReservationNum, Model model){
        accReservationNum=Long.valueOf(7);
        Manageremail="매니저1@naver.com";
        model.addAttribute("accreservationlist", userService.accSelect(accReservationNum));
        model.addAttribute("managerInfo", managerService.managerInfo(Manageremail));

    }

    @GetMapping("user_userdetails4")
    public String user_userdetails4(Criteria criteria, Model model){


        model.addAttribute("pageDTO", new PageDTO(criteria, userService.getTotal()));
        return "/user/user_userdetails4";
    }

    @GetMapping("myReview")
    public String myReview(Criteria criteria, Model model, @RequestParam String userEmail, @RequestParam String userName) {
        log.info("---------------------");
        log.info("myReview--------");
        log.info("userEmail-------- " + userEmail);
        log.info("userName--------" + userName);
        log.info("criteria--------" + criteria);

        log.info("---------------------");



        model.addAttribute("UserReviewDTO", userService.reviewGetListUser(criteria, userEmail));
        model.addAttribute("pageDTO", new PageDTO(criteria, userService.reviewGetTotal(criteria)));

        return "/user/myReview";
    }

    @GetMapping("review2")
    public String review2(HttpServletRequest req, Model model) {


        return "/user/review2";
    }

    @GetMapping("review1")
    public String review1(Model model, @RequestParam String userEmail, @RequestParam String userName) {
        log.info("---------------------");
        log.info("review1--------");
        log.info("myReview--------");
        log.info("userEmail-------- " + userEmail);
        log.info("userName--------" + userName);
        log.info("---------------------");

        model.addAttribute("careReviewDTO", userService.reviewGetListCare(userEmail));
        model.addAttribute("accReviewDTO", userService.reviewGetListAcc(userEmail));

        /*model.addAttribute("accReviewDTO", new AccReviewDTO(userService.reviewGetListAcc()));
        model.addAttribute("careReviewDTO", new CareReviewDTO(userService.reviewGetListCare()));*/

        return "/user/review1";
    }


    @GetMapping("review")
    public String reviewGetList(Criteria criteria, Model model) {
        log.info("---------------------");
        log.info("reviewGetList--------");
        log.info("---------------------");

        model.addAttribute("reviewList", userService.reviewGetList(criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, userService.reviewGetTotal(criteria)));

        return "/user/review";
    }


    // 게시글 추가
    @PostMapping("review2")
    public RedirectView register(ReviewVO reviewVO, RedirectAttributes rttr, HttpServletRequest req) {
        log.info("----------------------------");
        log.info("register............. : " + reviewVO);
        log.info("----------------------------");

        userService.register(reviewVO);
        rttr.addFlashAttribute("reviewNum", reviewVO.getReviewNum());

        String userEmail = req.getParameter("userEmail");

        log.info("----------------------------");
        log.info("userEmail" + userEmail);
        log.info("----------------------------");
        String userName = req.getParameter("userName");
        log.info("----------------------------");
        log.info("userName" +userName);
        log.info("----------------------------");

        return new RedirectView("/user/review");
    }

    //    게시글 상세보기
    @GetMapping({"readReview", "modifyReview"})
    public void readReview(Long reviewNum, HttpServletRequest req, Model model) {
        log.info("----------------------------");
        log.info(req.getRequestURI() + "............. : " + reviewNum);
        log.info("----------------------------");
        model.addAttribute("review", userService.get(reviewNum));
    }

    // 수정
    @PostMapping("modifyReview")
    public RedirectView modifyReview(ReviewVO reviewVO, RedirectAttributes rttr) {
        log.info("----------------------------");
        log.info("modifyReview............. : " + reviewVO);
        log.info("----------------------------");
        userService.modify(reviewVO);
        rttr.addAttribute("reviewNum", reviewVO.getReviewNum());
        return new RedirectView("/user/readReview");


    }

    // 삭제
    @PostMapping("reviewRemove")
    public String reviewRemove(Long reviewNum, Criteria criteria, Model model) {
        log.info("----------------------------");
        log.info("reviewRemove............. : " + reviewNum);
        log.info("----------------------------");

        userService.reviewRemove(reviewNum);
        return reviewGetList(criteria, model);
    }

}
