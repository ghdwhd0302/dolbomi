package com.project.dolbomi.mapper;

import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.AccReviewDTO;
import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.UserReviewDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccReservationMapper {
    //    동행서비스 예약리스트에 해당 번호 존재하는지 확인
    public int AccGetList(Long accReservationNum);

    // 동행서비스 예약자 1명 정보
    public AccReservationVO AccGet(Long accReservationNum);

    //    동행서비스 예약하기
    public void insert(AccReservationVO accReservationVO);
    //    동행서비스 예약정보확인
    public AccReservationVO select(Long accReservationNum);

    // 동행서비스 매니저 배정 수락 user_userdetails페이지
    public AccReservationVO Accupdate(Long accReservationNum);

    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    public int AccRefuseupdate(AccReservationVO accReservationVO);

    // 동행서비스 매니저가  예약 거절 manager페이지
    public int AccManagerRefuse(AccReservationVO accReservationVO);

     // 고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    public int delete(Long accReservationNum);

    public List<AccReservationVO> AccResult(String accReservationName);

    public void insertmanagerEmail(String accReservationVO);

    // acc reservation 게시글 목록
    public List<AccReviewDTO> reviewGetListAcc(String userEmail);
}
