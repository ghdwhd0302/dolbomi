package com.project.dolbomi.service.user;

import com.project.dolbomi.domain.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    // 돌봄서비스 수락
    public void careApprove(long careReservationNum);

    // 돌봄서비스 거절
    public void careRefuse(long careReservationNum);

    // 동행서비스 수락
    public void accApprove(long accReservationNum);

    // 동행서비스 거절
    public void accRefuse(long accReservationNum);

    // 회원 가입
    public void join(UserVO userVO);

    //회원 탈퇴
    public void withdrawal(String userEmail);

    //프로필 페이지
    public void profile(String userEmail);

    //프로필 수정
    public void modify(UserVO userVO);

}