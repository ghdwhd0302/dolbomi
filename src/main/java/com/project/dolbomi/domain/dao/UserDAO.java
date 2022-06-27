package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.UserVO;
import com.project.dolbomi.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;


    /*  // 돌봄서비스 수락
      public int careApprove(long careReservationNum){
          return userMapper.careApprove(careReservationNum);
      }

      // 돌봄서비스 거절
      public int careRefuse(long careReservationNum){
          return userMapper.careRefuse(careReservationNum);
      }

      // 동행서비스 수락
      public void accApprove(long accReservationNum){

      }

      // 동행서비스 거절
      public void accRefuse(long accReservationNum){

      }
  */
    // 회원 가입
    public void join(UserVO userVO){
        userMapper.insert(userVO);
    }

    // 회원 로그인
    public boolean userLogIn(String userEmail, String userPw){
        return userMapper.userLogIn(userEmail, userPw) == 1 ;
    }

    //회원 탈퇴
    public boolean withdrawal(String userEmail){
        return userMapper.delete(userEmail).equals(1) ;
    }

    //프로필 페이지
    public UserVO selectProfile(String userEmail){
        return userMapper.selectProfile(userEmail);
    }

    //프로필 수정
    public boolean usermodify(UserVO userVO){

        return userMapper.updateProfile(userVO).equals(1);
    }

    public int getTotal(){
        return userMapper.getTotal();
    }
}


