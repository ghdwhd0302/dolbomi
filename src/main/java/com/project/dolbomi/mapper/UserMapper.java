package com.project.dolbomi.mapper;


import com.project.dolbomi.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {


    // 회원 가입
    public void insert(UserVO userVO);

    //회원 탈퇴
    public String delete(String userEmail);

    //프로필 페이지
    public String select(String userEmail);

    //프로필 수정
    public int update(UserVO userVO);

    //로그 인
    public int userLogIn(String userEmail, String userPw);


    public int getTotal();

    public UserVO selectProfile(String userEmail);

    public UserVO updateProfile(UserVO userVO);


}
