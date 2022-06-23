package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.UserVO;
import com.project.dolbomi.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;


    // 돌봄서비스 수락
    public void careApprove(long careReservationNum){

    }

    // 돌봄서비스 거절
    public void careRefuse(long careReservationNum){

    }

    // 동행서비스 수락
    public void accApprove(long accReservationNum){

    }

    // 동행서비스 거절
    public void accRefuse(long accReservationNum){

    }

    // 회원 가입
    public void join(UserVO userVO){
        userMapper.insert(userVO);
    }

    // 회원 로그인
    public void login(UserVO userVO){

    }

    //회원 탈퇴
    public void withdrawal(String userEmail){

    }

    //프로필 페이지
    public void profile(String userEmail){

    }

    //프로필 수정
    public void modify(UserVO userVO){

    }

    public int getTotal(){
        return userMapper.getTotal();
    }
}
