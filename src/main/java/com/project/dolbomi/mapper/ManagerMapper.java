package com.project.dolbomi.mapper;



import com.project.dolbomi.domain.vo.ManagerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerMapper {

    //    동행서비스 리스트
    public List<ManagerVO> accgetList();
    //    돌봄서비스 리스트
    public List<ManagerVO> caregetList();

    //    동행서비스 신청
    public int accapply(long accReservationNum);
    //    돌봄서비스 신청
    public int careapply(long careReservationNum);

    //    매니저 탈퇴
    public String delete(String userEmail);


    public int getTotal();

    //매니저 회원가입
    public void insert(ManagerVO managerVO);

    //이메일 중복체크
    public int emailCheck(String managerEmail);

    //매니저 로그인
    public int managerLogIn(String managerEmail, String managerPw);



    public ManagerVO managerInfo(String managerEmail);
}
