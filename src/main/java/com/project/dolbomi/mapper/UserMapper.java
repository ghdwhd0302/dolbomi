package com.project.dolbomi.mapper;


import com.project.dolbomi.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

    //이메일 중복체크
    public int emailCheck(String userEmail);

    public int getTotal();

    public UserVO selectProfile(String userEmail);

    public UserVO updateProfile(UserVO userVO);

    //아이디 찾기
    @Select("SELECT NVL(USER_EMAIL, 0) FROM TBL_USER WHERE USER_NAME=#{userName} and USER_PHONE_NUM=#{userPhoneNum} and USER_BIRTH=#{userBirth}")
    public String findId(@Param("userName") String userName, @Param("userPhoneNum") String userPhoneNum, @Param("userBirth")String userBirth);


}


