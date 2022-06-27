package com.project.dolbomi.service.user;

import com.project.dolbomi.domain.dao.AccReservationDAO;
import com.project.dolbomi.domain.dao.CareReservationDAO;
import com.project.dolbomi.domain.dao.ReviewDAO;
import com.project.dolbomi.domain.dao.UserDAO;
import com.project.dolbomi.domain.vo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Primary
@Qualifier("user")
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    private final ReviewDAO reviewDAO;
    private final AccReservationDAO accReservationDAO;
    private final CareReservationDAO careReservationDAO;


    // 돌봄서비스 매니저 배정 수락
    @Override
    public boolean careApprove(CareReservationVO careReservationVO ) {
        return careReservationDAO.caremanager(careReservationVO);
    }
    // 돌봄서비스 매니저 배정 거절 user_userdetails페이지
    @Override
    public boolean careRefuse(CareReservationVO careReservationVO) {
        return careReservationDAO.careRefuseupdate(careReservationVO);
    }
    // 돌봄서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    @Override
    public boolean careDelte(Long careReservationNum) {
        return careReservationDAO.careDelte(careReservationNum);
    }

    // 돌봄서비스 매니저가  예약 거절 manager페이지
    @Override
    public boolean careManagerRefuse(CareReservationVO careReservationVO) {
        return  careReservationDAO.CareManagerRefuse(careReservationVO);
    }


    // 동행서비스 매니저 배정 수락 user_userdetails페이지
    @Override
    public boolean accApprove(AccReservationVO accReservationVO) {
        return accReservationDAO.accmanager(accReservationVO);
    }

    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    @Override
    public boolean accRefuse(AccReservationVO accReservationVO) {
        return accReservationDAO.accRefuseupdate(accReservationVO);
    }
    // 동행서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    @Override
    public boolean accDelete(Long accReservationNum) {
        return accReservationDAO.accDelte(accReservationNum);
    }

    // 동행서비스 매니저가  예약 거절 manager페이지
    @Override
    public boolean accManagerRefuse(AccReservationVO accReservationVO) {
        return  accReservationDAO.accManagerRefuse(accReservationVO);
    }


    @Override
    public void join(UserVO userVO) {
        userDAO.join(userVO);
    }

    @Override
    public boolean withdrawal(String userEmail) {
        return userDAO.withdrawal(userEmail);
    }

    @Override
    public boolean userLogIn(String userEmail, String userPw) {
        return userDAO.userLogIn(userEmail, userPw);
    }

    @Override
    public UserVO profile(String userEmail) {
        return userDAO.selectProfile(userEmail);
    }

    @Override
    public void modify(UserVO userVO) {

    }

    @Override
    public List<UserVO> getList(Criteria criteria) {
        return null;
    }


    @Override
    public int getTotal() {
        return userDAO.getTotal();
    }

    /*ReviewDAO*/
    @Override
    public List<ReviewVO> reviewGetList(Criteria criteria) {return reviewDAO.reviewGetList(criteria);}

    @Override
    public void register(ReviewVO reviewVO) {reviewDAO.register(reviewVO);}

    @Override
    public ReviewVO get(Long reviewNum) {
        return reviewDAO.findByReviewNum(reviewNum);
    }

    //@Override
    //public ReviewVO findByReviewNum(Long reviewNum) {
    //    return reviewDAO.findByReviewNum(reviewNum);
    //}

    @Override
    public boolean modify(ReviewVO reviewVO) {
        return reviewDAO.modify(reviewVO);
    }

    @Override
    public boolean reviewRemove(Long reviewNum) {
        return reviewDAO.reviewRemove(reviewNum);
    }

    @Override
    public int reviewGetTotal(Criteria criteria) {
        return reviewDAO.reviewGetTotal(criteria);
    }


}
