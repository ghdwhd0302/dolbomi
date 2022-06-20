package com.project.dolbomi.mapper;



import com.project.dolbomi.domain.vo.ManagerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerMapper {

    //    동행서비스 리스트
    public List<ManagerVO> accgetList();
    //    돌봄서비스 리스트
    public List<ManagerVO> caregetList();

    //    동행서비스 신청
    public int accapply(long accreservationNum);
    //    돌봄서비스 신청
    public int careapply(long carereservationNum);

    //    매니저 탈퇴
    public String delete(String userEmail);
}
