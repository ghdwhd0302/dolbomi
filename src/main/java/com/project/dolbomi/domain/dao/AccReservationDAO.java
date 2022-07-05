package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.*;
import com.project.dolbomi.mapper.AccReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AccReservationDAO {
    private final AccReservationMapper accReservationMapper;



    //    동행서비스 예약하기
    public void accReservation(AccReservationVO accReservationVO){
        accReservationMapper.insert(accReservationVO);
    }
    //    동행서비스 예약정보확인
    public void accReservationInfo(Long accReservationNum){

    }

    // accreservation review list
    public List<AccReviewDTO> reviewGetListAcc(String userEmail) {
        return accReservationMapper.reviewGetListAcc(userEmail);
    }


    // accreservation select one
    public AccReservationVO selectAcc(Long AccReservationNum) {
        return accReservationMapper.selectAcc(AccReservationNum);
    }

    //    동행서비스 리스트
    public List<AccReservationVO> getListAccReservation(Criteria criteria, List<String> areaAr) {
        return accReservationMapper.getListAccReservation(criteria);
    }



    // 동행서비스 매니저 배정 수락 user_userdetails페이지
    public void AccManagerY(String userEmail){
        accReservationMapper.AccManagerY(userEmail) ;
    }
    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    public void AccManagerN(String userEmail){
        accReservationMapper.AccManagerN(userEmail);
    }

    // 동행서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    public void Accdelete(Long accReservationNum){
        accReservationMapper.Accdelete(accReservationNum);
    }
    //동행서비스 매니저의 업무 시작,manager 페이지의 동행예약목록
    public void AccManagerStart(Long accReservationNum){
        accReservationMapper.AccManagerStart(accReservationNum) ;
    }
    //동행서비스 매니저의 업무 종료,manager 페이지의 동행예약목록
    public void AccManagerEnd(Long accReservationNum){
        accReservationMapper.AccManagerEnd(accReservationNum);
    }

    //동행서비스 매니저가 업무 취소,manager 페이지의 동행예약목록
    public void AccManagerCancel(Long accReservationNum){
        accReservationMapper.AccManagerCancel(accReservationNum);
    }

    //    동행서비스 예약자 1명 정보
    public AccReservationVO AccGet(Long accReservationNum){
        return accReservationMapper.AccGet(accReservationNum)  ;
    }

    public AccReservationVO accgetNum1(String userEmail){ return accReservationMapper.accgetNum1(userEmail);}
    public AccReservationVO accgetNum2(String userEmail){ return accReservationMapper.accgetNum2(userEmail);}
    public AccReservationVO accgetNum3(String userEmail){ return accReservationMapper.accgetNum3(userEmail);}
    public AccReservationVO accgetNum4(String userEmail){ return accReservationMapper.accgetNum4(userEmail);}

    public int accgetTotal1(String userEmail){
        return accReservationMapper.accgetTotal1(userEmail);
    }
    public int accgetTotal2(String userEmail){
        return accReservationMapper.accgetTotal2(userEmail);
    }
    public int accgetTotal3(String userEmail){
        return accReservationMapper.accgetTotal3(userEmail);
    }
    public int accgetTotal4(String userEmail){
        return accReservationMapper.accgetTotal4(userEmail);
    }

    //유저 이메일로 매니저 예약메일 통해 매니저정보얻기
    public ManagerVO accgetManagerInfo(String userEmail){return accReservationMapper.accgetManagerInfo(userEmail);}


    public void AccReservationUpdate(Long accReservationNum, String managerEmail){
        accReservationMapper.AccReservationUpdate(accReservationNum, managerEmail);
    }

}

