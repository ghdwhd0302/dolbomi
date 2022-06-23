package com.project.dolbomi.service.member;

import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.CareReservationVO;
import com.project.dolbomi.domain.vo.ReviewVO;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    /*AccReservationDAO*/
    //    동행서비스 예약리스트
    public void AccGetList();

    //    동행서비스 예약하기
    public void accReservation(AccReservationVO accReservationVO);

    //    동행서비스 예약정보확인
    public void accReservationInfo(Long accReservationNum);

    //    동행서비스 예약삭제
    public void accRemove(Long accReservationNum);

//    --------------------------------------------------------------------
    /*CareReservationDAO*/
    //    돌봄서비스 예약리스트
    public void careGetList();

    //    돌봄서비스 예약하기
    public void careReservation(CareReservationVO careReservationVO);

    //    돌봄서비스 예약정보
    public void careReservationInfo(Long careReservationNum);

    //    돌봄서비스 예약삭제
    public void careRemove(Long careReservationNum);

//    ----------------------------------------------------------------------


}
