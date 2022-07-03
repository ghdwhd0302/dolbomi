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



    // 동행서비스 매니저 배정 수락 user_userdetails페이지
    public void AccManagerY(Long accReservationNum){
        accReservationMapper.AccManagerY(accReservationNum) ;
    }
    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    public void AccManagerN(Long accReservationNum){
        accReservationMapper.AccManagerN(accReservationNum);
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


    public int accgetTotal1(Long accReservationNum){
        return accReservationMapper.accgetTotal1(accReservationNum);
    }
    public int accgetTotal2(Long accReservationNum){
        return accReservationMapper.accgetTotal2(accReservationNum);
    }
    public int accgetTotal3(Long accReservationNum){
        return accReservationMapper.accgetTotal3(accReservationNum);
    }
    public int accgetTotal4(Long accReservationNum){
        return accReservationMapper.accgetTotal4(accReservationNum);
    }

}
