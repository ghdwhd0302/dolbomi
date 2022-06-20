package com.project.dolbomi.mapper;

import com.project.dolbomi.domain.vo.AccReservationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccReservationMapper {
    //    동행서비스 예약리스트
    public List<AccReservationVO> getList();
    //    동행서비스 예약하기
    public void insert(AccReservationVO accReservationVO);
    //    동행서비스 예약정보확인
    public AccReservationVO select(Long accreservationNum);
    //    동행서비스 예약삭제
    public int delete(Long accreservationNum);

}
