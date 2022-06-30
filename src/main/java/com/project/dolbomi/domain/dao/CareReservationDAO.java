package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.AccReviewDTO;
import com.project.dolbomi.domain.vo.CareReservationVO;
import com.project.dolbomi.domain.vo.CareReviewDTO;
import com.project.dolbomi.mapper.CareReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CareReservationDAO {
    private final CareReservationMapper careReservationMapper;

    //    돌봄서비스 예약리스트
    public List<CareReservationVO> CareGetList(Long careReservationNum) {
        return careReservationMapper.CareGetList(careReservationNum)  ;
    }

    //    돌봄서비스 예약하기
    public void careReservation(CareReservationVO careReservationVO) {
        careReservationMapper.insert(careReservationVO);
    }

    //    돌봄서비스 예약정보
    public void careReservationInfo(Long careReservationNum) {
    }

    // 돌봄서비스 매니저 배정 수락
    public boolean caremanager(CareReservationVO careReservationVO){
        return careReservationMapper.Careupdate(careReservationVO) == 1;
    }

    // 돌봄서비스 매니저 배정 거절 user_userdetails페이지
    public boolean careRefuseupdate(CareReservationVO careReservationVO){
        return careReservationMapper.careRefuseupdate(careReservationVO) == 1;
    }

    // 돌봄서비스 매니저가  예약 거절 manager페이지
    public boolean CareManagerRefuse(CareReservationVO careReservationVO){
        return careReservationMapper.CareManagerRefuse(careReservationVO) == 1;
    }
    // 돌봄서비스고객이 예약취소,user_userdetails2 페이지의 돌봄예약 취소
    public boolean careDelte(Long careReservationNum){
        return careReservationMapper.delete(careReservationNum) == 1;
    }

    // carereservation review list
    public List<CareReviewDTO> reviewGetListCare() {
        return careReservationMapper.reviewGetListCare();
    }
}


