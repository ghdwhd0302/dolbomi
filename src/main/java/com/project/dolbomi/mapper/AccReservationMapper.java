package com.project.dolbomi.mapper;

import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.AccReviewDTO;
import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.UserReviewDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccReservationMapper {




    //    동행서비스 예약하기
    public void insert(AccReservationVO accReservationVO);
    //    동행서비스 예약정보확인
    public AccReservationVO select(Long accReservationNum);



    public List<AccReservationVO> AccResult(String accReservationName);

    public void insertmanagerEmail(String accReservationVO);

    // acc reservation 게시글 목록
    public List<AccReviewDTO> reviewGetListAcc(String userEmail);






    // 동행서비스 예약자 1명 정보
    public AccReservationVO AccGet(Long accReservationNum);


    //동행서비스고객이 매니저 배정수락,user_userdetails 페이지의 동행예약목록
    public void AccManagerY(Long accReservationNum);
    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    public void AccManagerN(Long accReservationNum);
    // 고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    public int Accdelete(Long accReservationNum);
    //동행서비스 매니저의 업무 시작,manager 페이지의 동행예약목록
    public void AccManagerStart(Long accReservationNum);
    //동행서비스 매니저의 업무 종료,manager 페이지의 동행예약목록
    public void AccManagerEnd(Long accReservationNum);
    //동행서비스 매니저가 업무 취소,manager 페이지의 동행예약목록
    public int AccManagerCancel(Long accReservationNum);
    //user_userdetails의 카운트 횟수.  ACC_RESERVATION_STATUS 에 따라 변경
    public int accgetTotal1(Long accReservationNum);
    public int accgetTotal2(Long accReservationNum);
    public int accgetTotal3(Long accReservationNum);
    public int accgetTotal4(Long accReservationNum);
}
