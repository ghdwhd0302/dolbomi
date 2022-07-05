package com.project.dolbomi.controller.manager;

import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.ManagerVO;
import com.project.dolbomi.domain.vo.PageDTO;
import com.project.dolbomi.service.manager.ManagerService;
import com.project.dolbomi.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/manager/*")
public class ManagerController {
    private final ManagerService managerService;
    private final UserService userService;

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
        Long careReservationNum=Long.valueOf(26);
        Long accReservationNum=Long.valueOf(42);
        userService.CareManagerStart(careReservationNum);
        userService.AccManagerStart(accReservationNum);
        return "/manager/manager2";
    }

    //    서비스 상태 변경(취소)
    @GetMapping("cancelService")
    public String serviceCancel(){
        Long careReservationNum=Long.valueOf(26);
        Long accReservationNum=Long.valueOf(42);
        userService.CareManagerCancel(careReservationNum);
        userService.AccManagerCancel(accReservationNum);
        return "/member/mainpage";
    }

    //    서비스 상태 변경(종료)
    @GetMapping("endService")
    public String serviceEnd(){
        Long careReservationNum=Long.valueOf(26);
        Long accReservationNum=Long.valueOf(42);
        userService.CareManagerEnd(careReservationNum);
        userService.AccManagerEnd(accReservationNum);
        return "/manager/manager3";
    }


    //    매니저 회원가입
    @PostMapping("manageregi")
    public String managerJoin(ManagerVO managerVO){
        log.info("---------------------------------------");
        log.info("managerJoin............. : " + managerVO);
        log.info("---------------------------------------");

        managerService.join(managerVO);
        return "/member/managerlogin";
    }

    //    이메일 중복검사
    @PostMapping("emailcheck")
    @ResponseBody
    public int emailCheck(@RequestParam("managerEmail") String managerEmail){
        int cnt = managerService.emailCheck(managerEmail);
        return cnt;
    }

    //  페이지 이동
    @GetMapping("manager")
    public String manager( Model model){
        Long careReservationNum=Long.valueOf(26);
        Long accReservationNum=Long.valueOf(42);
        String accManageremail = "APPLE";
        String careManageremail = "APPLE";

        log.info("-----careManageremail" + managerService.managerInfo(careManageremail) );
        log.info("-----careReservationNum" + userService.CareGet(careReservationNum) );

        model.addAttribute("totallist2", userService.accgetTotal2(accReservationNum));
        model.addAttribute("totallist3", userService.accgetTotal3(accReservationNum));
        model.addAttribute("totallist4", userService.accgetTotal4(accReservationNum));
        model.addAttribute("totallist6", userService.caregetTotal6(careReservationNum));
        model.addAttribute("totallist7", userService.caregetTotal7(careReservationNum));
        model.addAttribute("totallist8", userService.caregetTotal8(careReservationNum));

        model.addAttribute("accreservationlist", userService.AccGet(accReservationNum));
        model.addAttribute("carereservationlist", userService.CareGet(careReservationNum));

        model.addAttribute("accmanagerInfo", managerService.managerInfo(accManageremail));
        model.addAttribute("caremanagerInfo", managerService.managerInfo(careManageremail));

        return "/manager/manager";


    }

    @PostMapping("manager")
    public String manager(@RequestParam String managerEmail, HttpServletRequest req){
        String accNum = req.getParameter("accReservationNum");
        String careNum = req.getParameter("careReservationNum");

        log.info("------accNum" + accNum);
        log.info("------managerEmail" + managerEmail);
        log.info("------careNum" + careNum);

        if (accNum==null) {
            Long careReservationNum = Long.parseLong(careNum);
            log.info("-----" + Long.parseLong(careNum));
            userService.CareReservationUpdate(careReservationNum, managerEmail);
            return "/manager/manager";
        }

        Long accReservationNum = Long.parseLong(accNum);
        userService.AccReservationUpdate(accReservationNum, managerEmail);

        return "/manager/manager";
        String careNum = req.getParameter("careReservationNum");
        String accNum = req.getParameter("accReservationNum");

        log.info("------managerEmail" + managerEmail);
        log.info("------careNum" + careNum);
        log.info("------accNum" + accNum);

        if (accNum==null) {
            Long careReservationNum = Long.parseLong(careNum);
            log.info("-----careNum1" + Long.parseLong(careNum));
            userService.CareReservationUpdate(careReservationNum, managerEmail);
            return "/manager/manager";
        } else {
            Long accReservationNum = Long.parseLong(accNum);
            log.info("-----accNum1" + Long.parseLong(accNum));
            userService.AccReservationUpdate(accReservationNum, managerEmail);
            return "/manager/manager";
        }
    }

    @GetMapping("manager2")
    public String manager2(Model model){
        Long careReservationNum=Long.valueOf(26);
        Long accReservationNum=Long.valueOf(42);
        String accManageremail = "APPLE";
        String careManageremail = "APPLE";

        model.addAttribute("totallist2", userService.accgetTotal2(accReservationNum));
        model.addAttribute("totallist3", userService.accgetTotal3(accReservationNum));
        model.addAttribute("totallist4", userService.accgetTotal4(accReservationNum));
        model.addAttribute("totallist6", userService.caregetTotal6(careReservationNum));
        model.addAttribute("totallist7", userService.caregetTotal7(careReservationNum));
        model.addAttribute("totallist8", userService.caregetTotal8(careReservationNum));

        model.addAttribute("accreservationlist", userService.AccGet(accReservationNum));
        model.addAttribute("carereservationlist", userService.CareGet(careReservationNum));

        model.addAttribute("accmanagerInfo", managerService.managerInfo(accManageremail));
        model.addAttribute("caremanagerInfo", managerService.managerInfo(careManageremail));

        return "/manager/manager2";
    }

    @GetMapping("manager3")
    public String manager3(Criteria criteria, Model model){

        Long careReservationNum=Long.valueOf(26);
        Long accReservationNum=Long.valueOf(42);
        String accManageremail = "APPLE";
        String careManageremail = "APPLE";

        model.addAttribute("totallist2", userService.accgetTotal2(accReservationNum));
        model.addAttribute("totallist3", userService.accgetTotal3(accReservationNum));
        model.addAttribute("totallist4", userService.accgetTotal4(accReservationNum));
        model.addAttribute("totallist6", userService.caregetTotal6(careReservationNum));
        model.addAttribute("totallist7", userService.caregetTotal7(careReservationNum));
        model.addAttribute("totallist8", userService.caregetTotal8(careReservationNum));

        model.addAttribute("accreservationlist", userService.AccGet(accReservationNum));
        model.addAttribute("carereservationlist", userService.CareGet(careReservationNum));

        model.addAttribute("accmanagerInfo", managerService.managerInfo(accManageremail));
        model.addAttribute("caremanagerInfo", managerService.managerInfo(careManageremail));

        model.addAttribute("historyList", managerService.getList(criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, managerService.getTotal()));
        return "/manager/manager3";
    }

    @GetMapping("manager_rev")
    public String manager_rev(Criteria criteria, Model model){
        List<String> areaAr = new ArrayList<>();
//        model.addAttribute("applyList", managerService.getList(criteria));
        model.addAttribute("getListAccReservation", userService.getListAccReservation(criteria, areaAr));
        model.addAttribute("getListCareReservation", userService.getListCareReservation(criteria, areaAr));
        model.addAttribute("pageDTO", new PageDTO(criteria, managerService.getTotal()));
        return "/manager/manager_rev";
    }

    @PostMapping("manager_rev")
    public String manager_rev(Criteria criteria, Model model, HttpServletRequest request){
        String[] area = request.getParameterValues("area1[]");

        log.info("area----------------------------");
        for (String areas:area) {
            log.info(areas);
        }
        log.info("----------------------------");

        List<String> areaAr = new ArrayList();

        Arrays.stream(area).filter(v -> !v.isEmpty()).map(v -> v.replace(" 전체", "")).forEach(v -> areaAr.add(v));

        log.info("사이즈---------------" + areaAr.size());
        areaAr.stream().forEach(log::info);
        model.addAttribute("areaAr", areaAr);
        model.addAttribute("getListAccReservation", userService.getListAccReservation(criteria, areaAr));
        model.addAttribute("getListCareReservation", userService.getListCareReservation(criteria, areaAr));
        model.addAttribute("pageDTO", new PageDTO(criteria, managerService.getTotal()));
        return "/manager/manager_rev";
    }

    @GetMapping("manageregi")
    public void manageregi(){}



}