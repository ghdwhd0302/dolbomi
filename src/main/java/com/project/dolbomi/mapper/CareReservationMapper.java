package com.project.dolbomi.mapper;


import com.project.dolbomi.domain.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.PropertyValues;

import java.util.List;

@Mapper
public interface CareReservationMapper {
    //    돌봄서비스 예약리스트
    public List<CareReservationVO> CareGetList(Long careReservationNum);
    //    돌봄서비스 예약하기
    public void insert(CareReservationVO careReservationVO);
    //    돌봄서비스 예약정보
    public CareReservationVO select(Long careReservationNum);

    // 돌봄서비스 매니저 배정 수락 ,user_userdetails 페이지의 돌봄예약목록
    public int Careupdate(CareReservationVO careReservationVO);

    // 돌봄서비스 매니저 배정 거절 user_userdetails페이지
    public int careRefuseupdate(CareReservationVO careReservationVO);

    // 돌봄서비스 매니저가  예약 거절 manager페이지
    public int CareManagerRefuse(CareReservationVO careReservationVO);

    // 돌봄서비스고객이 예약취소,user_userdetails2 페이지의 돌봄예약 취소
    public int delete(Long careReservationNum);

    //carereservation review list
    public List<CareReviewDTO> reviewGetListCare(String userEmail);

    // care reservation 게시글 한개 가져오기
    public CareReservationVO selectCare(Long careReservationNum);

    public List<CareReservationVO> getListCareReservation(Criteria criteria);
}
