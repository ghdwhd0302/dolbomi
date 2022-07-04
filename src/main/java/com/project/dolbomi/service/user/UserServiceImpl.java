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




    //    동행서비스 예약자 1명 정보
    @Override
    public AccReservationVO AccGet(Long accReservationNum) {
        return accReservationDAO.AccGet(accReservationNum);
    }

    @Override
    public int accgetTotal1(Long accReservationNum) {
        return accReservationDAO.accgetTotal1(accReservationNum);
    }
    @Override
    public int accgetTotal2(Long accReservationNum) {
        return accReservationDAO.accgetTotal2(accReservationNum);
    }
    @Override
    public int accgetTotal3(Long accReservationNum) {
        return accReservationDAO.accgetTotal3(accReservationNum);
    }
    @Override
    public int accgetTotal4(Long accReservationNum) {
        return accReservationDAO.accgetTotal4(accReservationNum);
    }

    // 동행서비스 매니저 배정 수락 user_userdetails페이지
    @Override
    public void AccManagerY(Long accReservationNum) {
        accReservationDAO.AccManagerY(accReservationNum);
    }
    // 동행서비스 매니저 배정 거절 user_userdetails페이지
    @Override
    public void AccManagerN(Long accReservationNum) {
        accReservationDAO.AccManagerN(accReservationNum);
    }
    // 동행서비스고객이 예약취소,user_userdetails2 페이지의 동행예약 취소
    @Override
    public void Accdelete(Long accReservationNum) {
        accReservationDAO.Accdelete(accReservationNum);
    }

    //동행서비스 매니저의 업무 시작,manager 페이지의 동행예약목록
    @Override
    public void AccManagerStart(Long accReservationNum) {
        accReservationDAO.AccManagerStart(accReservationNum);
    }
    //동행서비스 매니저의 업무 종료,manager 페이지의 동행예약목록
    @Override
    public void AccManagerEnd(Long accReservationNum) {
        accReservationDAO.AccManagerEnd(accReservationNum);
    }
    //동행서비스 매니저가 업무 취소,manager 페이지의 동행예약목록
    @Override
    public void AccManagerCancel(Long accReservationNum) {
        accReservationDAO.AccManagerCancel(accReservationNum);
    }


    //    돌봄서비스 예약자 1명 정보
    @Override
    public CareReservationVO CareGet(Long careReservationNum) {
        return careReservationDAO.CareGet(careReservationNum);
    }

    @Override
    public int caregetTotal5(Long careReservationNum) {
        return careReservationDAO.caregetTotal5(careReservationNum);
    }
    @Override
    public int caregetTotal6(Long careReservationNum) {
        return careReservationDAO.caregetTotal6(careReservationNum);
    }
    @Override
    public int caregetTotal7(Long careReservationNum) {
        return careReservationDAO.caregetTotal7(careReservationNum);
    }
    @Override
    public int caregetTotal8(Long careReservationNum) {
        return careReservationDAO.caregetTotal8(careReservationNum);
    }
    // 돌봄서비스 매니저 배정 수락 user_userdetails페이지
    @Override
    public void CareManagerY(Long careReservationNum) {
        careReservationDAO.CareManagerY(careReservationNum);
    }
    // 돌봄서비스 매니저 배정 거절 user_userdetails페이지
    @Override
    public void CareManagerN(Long careReservationNum) {
        careReservationDAO.CareManagerN(careReservationNum);
    }
    // 돌봄서비스고객이 예약취소,user_userdetails2 페이지의 돌봄예약 취소
    @Override
    public void Caredelete(Long careReservationNum) {
        careReservationDAO.Caredelete(careReservationNum);
    }
    //동행서비스 매니저의 업무 시작,manager 페이지의 동행예약목록
    @Override
    public void CareManagerStart(Long careReservationNum) {
        careReservationDAO.CareManagerStart(careReservationNum);
    }
    //동행서비스 매니저의 업무 종료,manager 페이지의 동행예약목록
    @Override
    public void CareManagerEnd(Long careReservationNum) {
        careReservationDAO.CareManagerEnd(careReservationNum);
    }
    //동행서비스 매니저가 업무 취소,manager 페이지의 동행예약목록
    @Override
    public void CareManagerCancel(Long careReservationNum) {
        careReservationDAO.CareManagerCancel(careReservationNum);
    }


    @Override
    public List<AccReservationVO> AccResult(String accReservationName) {
        return null;
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
    public String findId(String userName, String userPhoneNum, String userBirth) {
        String result = "";

        try {
            result= userDAO.findId(userName, userPhoneNum, userBirth);

        } catch(Exception e) {

            e.printStackTrace();
        }

        return result ;
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
    public int myReviewGetTotal(Criteria criteria, String userEmail) {
        return reviewDAO.myReviewGetTotal(criteria, userEmail);
    }

    @Override
    public List<UserReviewDTO> reviewGetListUser(Criteria criteria, String userEmail) {
        return reviewDAO.reviewGetListUser(criteria, userEmail);
    }


    // acc reservation review list
    @Override
    public List<AccReviewDTO> reviewGetListAcc(String userEmail){
        return accReservationDAO.reviewGetListAcc(userEmail);
    }

    // care reservation review list
    @Override
    public List<CareReviewDTO> reviewGetListCare(String userEmail){
        return careReservationDAO.reviewGetListCare(userEmail);
    }

    //care reservation select one
    @Override
    public CareReservationVO selectCare(Long careReservationNum) {
        return careReservationDAO.selectCare(careReservationNum);
    }

    // acc reservation select one
    @Override
    public AccReservationVO selectAcc(Long accReservationNum) {
        return accReservationDAO.selectAcc(accReservationNum);
    }


    @Override
    public List<AccReservationVO> getListAccReservation(Criteria criteria) {return accReservationDAO.getListAccReservation(criteria);}

    @Override
    public List<CareReservationVO> getListCareReservation(Criteria criteria) {return careReservationDAO.getListCareReservation(criteria);}





}
