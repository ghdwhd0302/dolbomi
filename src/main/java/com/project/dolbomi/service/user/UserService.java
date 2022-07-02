package com.project.dolbomi.service.user;

import com.project.dolbomi.domain.vo.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    // 돌봄서비스 매니저 배정 수락
    public boolean careApprove(CareReservationVO careReservationVO);

    // 돌봄서비스 매니저 배정 거절 user_userdetails페이지
    public boolean careRefuse(CareReservationVO careReservationVO);

    // 돌봄서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    public boolean careDelte(Long careReservationNum);

    // 돌봄서비스 매니저가  예약 거절 manager페이지
    public boolean careManagerRefuse(CareReservationVO careReservationV);
    // 동행서비스 매니저 배정 수락 user_userdetails페이지
    public boolean accApprove(AccReservationVO accReservationVO);

    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    public boolean accRefuse(AccReservationVO accReservationVO);

    // 동행서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    public boolean accDelete(Long accReservationNum);

    // 동행서비스 매니저가  예약 거절 manager페이지
    public boolean accManagerRefuse(AccReservationVO accReservationVO);

    //    동행서비스 예약자 1명 정보
    public AccReservationVO accSelect(Long accReservationNum);

    // 회원 가입
    public void join(UserVO userVO);

    //회원 탈퇴
    public boolean withdrawal(String userEmail);

    //로그 인
    public boolean userLogIn(String userEmail, String userPw);

    //이메일 중복체크
    public int emailCheck(String userEmail);

    //휴대폰 인증번호
    public void phoneCerti(String userPhoneNum, int randomNum);

    //프로필 페이지
    public UserVO profile(String userEmail);

    //프로필 수정
    public void modify(UserVO userVO);

    public List<UserVO> getList(Criteria criteria);

    public int getTotal();

    /*ReviewDAO*/
    //    게시글 목록
    public List<ReviewVO> reviewGetList(Criteria criteria);

    //    게시글 추가
    public void register(ReviewVO reviewVO);

    //    게시글 한 개 가져오기
    // dao에서는 이름 findByReviewNum
    public ReviewVO get(Long reviewNum);

    //    게시글 수정
    public boolean modify(ReviewVO reviewVO);

    //    게시글 삭제
    public boolean reviewRemove(Long reviewNum);

    //    게시글 전체 개수
    public int reviewGetTotal(Criteria criteria);

    // 회원 게시글 목록
    public List<UserReviewDTO> reviewGetListUser(Criteria criteria, String userEmail);

    // acc reservation 목록
    public List<AccReviewDTO> reviewGetListAcc(String userEmail);

    // care reservation 목록
    public List<CareReviewDTO> reviewGetListCare(String userEmail);


}