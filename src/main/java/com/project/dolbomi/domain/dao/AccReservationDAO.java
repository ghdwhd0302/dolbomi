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
        accReservationMapper.insert(accReservationVO);
    }
    //    동행서비스 예약정보확인
    public void accReservationInfo(Long accReservationNum){

    }

    //    동행서비스 일반 예약 상태 변경
    public void userAccReservationStatus(Long accReservationNum){}
    //    동행서비스 매니저 예약 상태 변경
    public void managerAccReservationStatus(Long accReservationNum){}

}