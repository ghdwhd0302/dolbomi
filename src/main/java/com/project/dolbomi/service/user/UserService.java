package com.project.dolbomi.service.user;

import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.ManagerVO;
import com.project.dolbomi.domain.vo.ReviewVO;
import com.project.dolbomi.domain.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<UserVO> getList(Criteria criteria);

    public int getTotal();

    /*ReviewDAO*/
    //    게시글 목록
    public List<ReviewVO> reviewGetList();

    //    게시글 추가
    public void register(ReviewVO reviewVO);

    //    게시글 한 개 가져오기
    // dao에서는 이름 findByReviewNum
    public ReviewVO get(Long reviewNum);

    //    게시글 수정
    public boolean modify(ReviewVO reviewVO);

    //    게시글 삭제
    public boolean reviewRemove(Long reviewNum);

    //    게시글 전체 개수
    public int reviewGetTotal();


}