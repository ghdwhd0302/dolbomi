package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.mapper.AccReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AccReservationDAO {
    private final AccReservationMapper accReservationMapper;

    //    동행서비스 예약리스트
    public void AccGetList(){

    }
    //    동행서비스 예약하기
    public void accReservation(AccReservationVO accReservationVO){

    }
    //    동행서비스 예약정보확인
    public void accReservationInfo(Long accReservationNum){

    }
    //    동행서비스 예약삭제
    public void accRemove(Long accReservationNum){

    }

}