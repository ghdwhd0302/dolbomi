package com.project.dolbomi.service.user;

import com.project.dolbomi.domain.vo.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //    동행서비스 예약자 1명 정보
    public AccReservationVO AccGet(Long accReservationNum);
    // user_userdetails의 카운트 횟수.  ACC_RESERVATION_STATUS 에 따라 변경
    public int accgetTotal1(Long accReservationNum);
    public int accgetTotal2(Long accReservationNum);
    public int accgetTotal3(Long accReservationNum);
    public int accgetTotal4(Long accReservationNum);

    // 동행서비스 매니저 배정 수락 user_userdetails페이지
    public void AccManagerY(Long accReservationNum);

    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    public void AccManagerN(Long accReservationNum);

    // 동행서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    public void Accdelete(Long accReservationNum);


    //    돌봄서비스 예약자 1명 정보
    public CareReservationVO CareGet(Long careReservationNum);
    // user_userdetails의 카운트 횟수.  CARE_RESERVATION_STATUS 에 따라 변경
    public int caregetTotal5(Long careReservationNum);
    public int caregetTotal6(Long careReservationNum);
    public int caregetTotal7(Long careReservationNum);
    public int caregetTotal8(Long careReservationNum);

    // 돌봄서비스 매니저 배정 수락 user_userdetails페이지
    public void CareManagerY(Long careReservationNum);

    // 돌봄서비스 매니저 배정 거절 user_userdetails페이지
    public void CareManagerN(Long careReservationNum);

    // 돌봄서비스고객이 예약취소,user_userdetails2 페이지의 돌봄예약 취소
    public void Caredelete(Long careReservationNum);





    //    동행서비스 예약리스트
    public List<AccReservationVO> AccResult(String accReservationName);


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
