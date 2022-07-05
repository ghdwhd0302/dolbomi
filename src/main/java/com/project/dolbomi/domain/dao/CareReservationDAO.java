package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.*;
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

    // carereservation review list
    public List<CareReviewDTO> reviewGetListCare(String userEmail) {
        return careReservationMapper.reviewGetListCare(userEmail);
    }

    //    돌봄서비스 리스트
    public List<CareReservationVO> getListCareReservation(Criteria criteria, List<String> areaAr) {
        return careReservationMapper.getListCareReservation(criteria, areaAr);
    }

    // carereservation select one
    public CareReservationVO selectCare(Long careReservationNum) {
        return careReservationMapper.selectCare(careReservationNum);
    }

    //    돌봄서비스 예약정보
    public void careReservationInfo(Long careReservationNum) {
    }

    // 돌봄서비스 매니저 배정 수락 user_userdetails페이지
    public void CareManagerY(Long careReservationNum){
        careReservationMapper.CareManagerY(careReservationNum) ;
    }
    // 돌봄서비스 매니저 배정 거절 user_userdetails페이지
    public void CareManagerN(Long careReservationNum){
        careReservationMapper.CareManagerN(careReservationNum);
    }

    // 돌봄서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    public void Caredelete(Long careReservationNum){
        careReservationMapper.Caredelete(careReservationNum);
    }

    //돌봄서비스 매니저의 업무 시작,manager 페이지의 동행예약목록
    public void CareManagerStart(Long accReservationNum){
        careReservationMapper.CareManagerStart(accReservationNum) ;
    }
    //돌봄서비스 매니저의 업무 종료,manager 페이지의 동행예약목록
    public void CareManagerEnd(Long accReservationNum){
        careReservationMapper.CareManagerEnd(accReservationNum);
    }

    //돌봄서비스 매니저가 업무 취소,manager 페이지의 동행예약목록
    public void CareManagerCancel(Long accReservationNum){
        careReservationMapper.CareManagerCancel(accReservationNum);
    }
    //    동행서비스 예약자 1명 정보
    public CareReservationVO CareGet(Long careReservationNum){
        return careReservationMapper.CareGet(careReservationNum)  ;
    }


    public int caregetTotal5(Long careReservationNum){
        return careReservationMapper.caregetTotal5(careReservationNum);
    }
    public int caregetTotal6(Long careReservationNum){
        return careReservationMapper.caregetTotal6(careReservationNum);
    }
    public int caregetTotal7(Long careReservationNum){
        return careReservationMapper.caregetTotal7(careReservationNum);
    }
    public int caregetTotal8(Long careReservationNum){
        return careReservationMapper.caregetTotal8(careReservationNum);
    }
    public void CareReservationUpdate(Long careReservationNum, String managerEmail){
        careReservationMapper.CareReservationUpdate(careReservationNum, managerEmail);
    }

    //돌봄 서비스 종료 리스트
    public List<User4CareDTO> careServiceEndList(String userEmail){return careReservationMapper.careServiceEndList(userEmail);}
}


