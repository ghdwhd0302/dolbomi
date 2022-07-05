package com.project.dolbomi.controller.member;

import com.project.dolbomi.domain.vo.ManagerVO;
import com.project.dolbomi.domain.vo.UserVO;
import com.project.dolbomi.service.manager.ManagerService;
import com.project.dolbomi.service.member.MemberService;
import com.project.dolbomi.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {
    private final MemberService memberService;
    private final UserService userService;
    private final ManagerService managerService;

//    일반 아이디 찾기
    @PostMapping("userIdF")
    @ResponseBody
    public String idFind(@RequestParam("userName") String userName, @RequestParam("userPhoneNum") String userPhoneNum, @RequestParam("userBirth") String userBirth){
       String result = userService.findId(userName, userPhoneNum, userBirth);
        return result;
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
    @PostMapping("userlogin")
    public String userLogIn(String userEmail, String userPw, HttpServletRequest request ){
        boolean check;
        check = userService.userLogIn(userEmail, userPw);

        if(check){//로그인 성공
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("userVO", userService.profile(userEmail));
            httpSession.setAttribute("userEmail",userEmail);

            return "/member/mainpage";
        }

        //로그인 실패
        return "/member/userlogin";
    }

//    로그 아웃
    @GetMapping("logout")
    public String logOut(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
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
    public String managerLogin(String managerEmail, String managerPw, HttpServletRequest request){
        boolean check;
        check = managerService.managerLogIn(managerEmail, managerPw);

        if(check){//로그인 성공
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("managerVO", managerService.managerInfo(managerEmail));
            httpSession.setAttribute("managerEmail",managerEmail);

            return "/member/mainpage";
        }

        //로그인 실패
       return "/member/managerlogin";
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
    public void introduce(){}

    @GetMapping("idfind")
    public void idfind(){}

    @GetMapping("idfind_manager")
    public void idfind_manager(){}

    @GetMapping("mainpage")
    public void mainpage(HttpServletRequest request){
        HttpSession httpSession = request.getSession();

        httpSession.getAttribute("userVO");
        httpSession.getAttribute("userEmail");

        String email=String.valueOf(httpSession.getAttribute("userVO"));
        String email2=String.valueOf(httpSession.getAttribute("userEmail"));
        userService.accgetTotal1(email2);
        log.info("-----------------------"+email);
        log.info("-----------------------"+userService.accgetTotal1(email2));
    }

    @GetMapping("userlogin")
    public void userlogin(){}

    @GetMapping("managerlogin")
    public void managerlogin(){}

    @GetMapping("faq")
    public void faq(){}

    @GetMapping("managerapply")
    public void managerapply(){}

    /* @GetMapping("profilechange")
     public String profilechange(HttpSession session, String userEmail, String managerEmail, HttpServletRequest req, Model model){
         if(session.getAttribute("userEmail")!=null){
             log.info("----------------------------");
             log.info(req.getRequestURI() + "............. : " + userEmail);
             log.info("----------------------------");
             model.addAttribute("profile1", userService.profile(userEmail));
         }else {
             model.addAttribute("msg","로그인한 사용자만 사용할수 있습니다.");
             return "/member/mainpage";
         }
         return "/member/profilechange";

     }*/
    @GetMapping("profilechange")
    public void profilechange( String userEmail, String managerEmail, HttpServletRequest req, Model model) {

        log.info("----------------------------");
        log.info(req.getRequestURI() + "............. : " + userEmail);
        log.info("----------------------------");
        model.addAttribute("profile1", userService.profile(userEmail));

    }

    @PostMapping("delete")
    public String profiledelete(String userEmail,String managerEmail){
        log.info("----------------------------");
        log.info("remove + ............. : " + userEmail);
        log.info("----------------------------");
        userService.withdrawal(userEmail);

        return "/member/mainpage";
    }

    @PostMapping("profileupdate")
    public RedirectView profileupdate(RedirectAttributes rttr, UserVO userVO, ManagerVO managerVO, HttpServletRequest req, Model model){
        log.info("----------------------------");
        log.info("modify............. : " + userVO);
        log.info("----------------------------");
/*
        rttr.addFlashAttribute("userimg", userVO.getUserImg());
*/
        rttr.addFlashAttribute("userName", userVO.getUserName());
        rttr.addFlashAttribute("userBirth", userVO.getUserBirth());
/*
        rttr.addFlashAttribute("managerEmail", managerVO.getManagerEmail());
*/

        userService.modify(userVO);
//        1. Flash 사용
//         세션에 파라미터를 저장하고, request 객체가 초기화된 후 다시 request에 담아준다.
        rttr.addFlashAttribute("userName", userVO.getUserName());
        rttr.addFlashAttribute("userBirth", userVO.getUserBirth());
        /* rttr.addFlashAttribute("managerEmail", managerVO.getManagerEmail());
         */
//        2. 쿼리 스트링
//        rttr.addAttribute("boardNumber", boardVO.getBoardNumber());
        return new RedirectView("/member/profilechange");

    }

    @GetMapping("pwfind")
    public void pwfind(){}

    @GetMapping("pwfind_manager")
    public void pwfind_manager(){}

    @GetMapping("passwordchange")
    public void passwordchange(){}





}
