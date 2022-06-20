package com.project.dolbomi.mapper;


import com.project.dolbomi.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 돌봄서비스 수락
    public int careapprove(long carereservationNum);

    // 돌봄서비스 거절
    public int carerefuse(long carereservationNum);

    // 동행서비스 수락
    public int accapprove(long accreservationNum);

    // 동행서비스 거절
    public int accrefuse(long accreservationNum);

    // 회원 가입
    public void insert(UserVO userVO);

    //회원 탈퇴
    public String delete(String userEmail);

    //프로필 페이지
    public UserVO select(String userEmail);

    //프로필 수정
    public int update(UserVO userVO);

    //카드 등록?


}
