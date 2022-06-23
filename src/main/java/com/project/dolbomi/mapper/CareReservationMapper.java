package com.project.dolbomi.mapper;


import com.project.dolbomi.domain.vo.CareReservationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CareReservationMapper {
    //    돌봄서비스 예약리스트
    public List<CareReservationVO> getList();
    //    돌봄서비스 예약하기
    public void insert(CareReservationVO careReservationVO);
    //    돌봄서비스 예약정보
    public CareReservationVO select(Long careReservationNum);
    //    돌봄서비스 일반 예약 상태 변경
    public void userCareReservationStatus(Long careReservationNum);
    //    돌봄서비스 매니저 예약 상태 변경
    public void managerCareReservationStatus(Long careReservationNum);


}
