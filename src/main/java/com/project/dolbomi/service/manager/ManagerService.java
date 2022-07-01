package com.project.dolbomi.service.manager;

import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.ManagerVO;
import com.project.dolbomi.domain.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ManagerService {

    //    동행서비스 리스트
    public void accGetList();

    //    돌봄서비스 리스트
    public void careGetList();

    //    동행서비스 신청
    public void accApply(long accReservationNum);

    //    돌봄서비스 신청
    public void careApply(long careReservationNum);

    //    매니저 탈퇴
    public void withdrawal(String userEmail);

    public List<ManagerVO> getList(Criteria criteria);

    public int getTotal();

    public ManagerVO getManagerPro(String userEmail);

    //매니저 회원가입
    public void join(ManagerVO managerVO);

    //매니저 로그인
    public boolean managerLogIn(String managerEmail, String managerPw);

    public ManagerVO managerInfo(String managerEmail);
}
