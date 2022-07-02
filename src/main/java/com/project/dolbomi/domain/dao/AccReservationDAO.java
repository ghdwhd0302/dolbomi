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

     //    동행서비스 예약리스트에 해당 번호 존재하는지 확인
    public boolean AccGetList(Long accReservationNum){
        return accReservationMapper.AccGetList(accReservationNum)==1 ;
    }
    //    동행서비스 예약자 1명 정보
    public AccReservationVO AccGet(Long accReservationNum){
        return accReservationMapper.AccGet(accReservationNum)  ;
    }


    //    동행서비스 예약하기
    public void accReservation(AccReservationVO accReservationVO){
        accReservationMapper.insert(accReservationVO);
    }
    //    동행서비스 예약정보확인
    public void accReservationInfo(Long accReservationNum){

    }


    // 동행서비스 매니저 배정 수락 user_userdetails페이지
    public AccReservationVO accmanager(Long accReservationNum){
        return accReservationMapper.Accupdate(accReservationNum) ;
    }
    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    public boolean accRefuseupdate(AccReservationVO accReservationVO){
        return accReservationMapper.AccRefuseupdate(accReservationVO) == 1;
    }
    // 동행서비스 매니저가  예약 거절 manager페이지
    public boolean accManagerRefuse(AccReservationVO accReservationVO){
        return accReservationMapper.AccManagerRefuse(accReservationVO) == 1;
    }

    // 동행서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    public boolean accDelte(Long accReservationNum){
        return accReservationMapper.delete(accReservationNum) == 1;
    }



    //매니저 이메일 인서트
    public void insertmanagerEmail(String accReservationVO){
        accReservationMapper.insertmanagerEmail(accReservationVO);
    }

    // accreservation review list
    public List<AccReviewDTO> reviewGetListAcc(String userEmail) {
        return accReservationMapper.reviewGetListAcc(userEmail);
    }

}
