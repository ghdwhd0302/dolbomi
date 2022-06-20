package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.CareReservationVO;
import com.project.dolbomi.mapper.CareReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CareReservationDAO {
    private final CareReservationMapper careReservationMapper;

    //    돌봄서비스 예약리스트
    public void careGetList(){

    }
    //    돌봄서비스 예약하기
    public void careReservation(CareReservationVO careReservationVO){

    }
    //    돌봄서비스 예약정보
    public void careReservationInfo(Long careReservationNum){

    }
    //    돌봄서비스 예약삭제
    public void careRemove(Long careReservationNum){

    }

}
