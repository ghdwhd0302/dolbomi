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

    @PostMapping("sendcode")
    public String phoneCerti(){
        return "/user/sendcode";
    }

    @RequestMapping(value = "/phoneCheck", method = RequestMethod.GET)
    @ResponseBody
    public String sendSMS(@RequestParam("phone") String userPhoneNum) { // 휴대폰 문자보내기
        int randomNum = (int)((Math.random()* (9999 - 1000 + 1)) + 1000);//난수 생성
<<<<<<< HEAD

=======
>>>>>>> 8ee97ab8b223caab94ad3b57aab699ec75ce17ee
        userService.phoneCerti(userPhoneNum,randomNum);
        log.info(Integer.toString(randomNum));
        return Integer.toString(randomNum);
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
    public void user_userdetails(Long accReservationNum,Long careReservationNum,HttpServletRequest req, Model model){
        log.info("----------------------------");
        log.info(req.getRequestURI() + "............. : " + careReservationNum);
        log.info(req.getRequestURI() + "............. : " + accReservationNum);
        log.info("----------------------------");

        model.addAttribute("carereservationlist", memberService.CareGetList(careReservationNum));
        model.addAttribute("accreservationlist", memberService.AccGetList(accReservationNum));
    }
    /* user_userdetails 의  매니저 수락*/
    @PostMapping("accet")
    public void accet(){
        log.info("----------------------------");
        log.info("----------------------------");


    }
    /* user_userdetails 의  매니저 거절*/
    @PostMapping("managerrefuse")
    public void managerrefuse(){
        log.info("----------------------------");
        log.info("----------------------------");


    }
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

    @GetMapping("myReview")
    public String myReview(Criteria criteria, Model model){
        log.info("---------------------");
        log.info("myReview--------");
        log.info("---------------------");

        model.addAttribute("reviewList", userService.reviewGetList(criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, userService.reviewGetTotal(criteria)));

        return "/user/myReview";
    }

    @GetMapping("review2")
    public void review2(){}


    @GetMapping("review")
    public String reviewGetList( Criteria criteria, Model model  ){
        log.info("---------------------");
        log.info("reviewGetList--------");
        log.info("---------------------");

        model.addAttribute("reviewList", userService.reviewGetList(criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, userService.reviewGetTotal(criteria)));

        return "/user/review";
    }


    // 게시글 추가
    @PostMapping("review2")
    public RedirectView register( ReviewVO reviewVO, RedirectAttributes rttr){
        log.info("----------------------------");
        log.info("register............. : " + reviewVO);
        log.info("----------------------------");

        userService.register(reviewVO);
        rttr.addFlashAttribute("reviewNum", reviewVO.getReviewNum());
        return new RedirectView("/user/review");
    }

    //    게시글 상세보기
    @GetMapping({"readReview", "modifyReview"})
    public void readReview(Long reviewNum, HttpServletRequest req, Model model){
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
    public String reviewRemove(Long reviewNum, Criteria criteria, Model model){
        log.info("----------------------------");
        log.info("reviewRemove............. : " + reviewNum);
        log.info("----------------------------");

        userService.reviewRemove(reviewNum);
        return reviewGetList(criteria, model);
    }


}
