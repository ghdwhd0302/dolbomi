package com.project.dolbomi.domain.dao;

import com.project.dolbomi.mapper.ManagerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ManagerDAO {
    private final ManagerMapper managerMapper;

    //    동행서비스 리스트
    public void accGetList(){

    }
    //    돌봄서비스 리스트
    public void careGetList(){

    }

    //    동행서비스 신청
    public void accApply(long accReservationNum){

    }
    //    돌봄서비스 신청
    public void careApply(long careReservationNum){

    }

    //    매니저 탈퇴
    public void withdrawal(String userEmail){

    }

    public int getTotal(){
        return managerMapper.getTotal();
    }
}

