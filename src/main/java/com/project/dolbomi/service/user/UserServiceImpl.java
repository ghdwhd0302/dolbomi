package com.project.dolbomi.service.user;

import com.project.dolbomi.domain.dao.AccReservationDAO;
import com.project.dolbomi.domain.dao.CareReservationDAO;
import com.project.dolbomi.domain.dao.ReviewDAO;
import com.project.dolbomi.domain.dao.UserDAO;
import com.project.dolbomi.domain.vo.*;
import lombok.RequiredArgsConstructor;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    private final UserReviewDTO userReviewDTO;


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
    public int emailCheck(String userEmail) {
        int cnt = userDAO.emailCheck(userEmail);
        return cnt;
    }

    @Override
    public void phoneCerti(String userPhoneNum, int randomNum) {
        String api_key = "NCSXDCGPLMOHCTXM";
        String api_secret = "QE2G9LQD0VVEUY44E4XSCQH4ABZGOIQC";
        Message coolsms = new Message(api_key, api_secret);

        // 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", userPhoneNum);    // 수신전화번호
        params.put("from", "010-8526-7235");    // 발신전화번호. 테스트시에는 발신,수신 둘다 본인 번호로 하면 됨
        params.put("type", "SMS");
        params.put("text", "[TEST] 인증번호는" + "["+randomNum+"]" + "입니다."); // 문자 내용 입력
        params.put("app_version", "test app 2.2"); // application name and version

        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }


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

    @Override
    public List<UserReviewDTO> reviewGetListUser(Criteria criteria, String userEmail) {
        return reviewDAO.reviewGetListUser(criteria, userEmail);
    }

    // acc reservation review list
    @Override
    public List<AccReviewDTO> reviewGetListAcc(){
        return accReservationDAO.reviewGetListAcc();
    }

    // care reservation review list
    @Override
    public List<CareReviewDTO> reviewGetListCare(){
        return careReservationDAO.reviewGetListCare();
    }


}