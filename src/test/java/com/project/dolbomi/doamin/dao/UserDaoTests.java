package com.project.dolbomi.doamin.dao;

import com.project.dolbomi.domain.dao.UserDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserDaoTests {
    @Autowired
    private UserDAO userDAO;

//    @Test
//    public void insertTest(){
//        UserVO userVO = new UserVO();
//        userVO.setUserName("새로운");
//        userVO.setUserBirth("20000101");
//        userVO.setUserGender("M");
//        userVO.setUserEmail("newman1@gmail.com");
//        userVO.setUserPw("1234");
//        userVO.setUserAddress("서울시 강남구");
//        userVO.setUserPhoneNum("010-1234-1234");
//
//        userDAO.join(userVO);
//        log.info("추가된 userEmail : " + userVO.getUserEmail());
//
//    }

    @Test
    public void loginTest(){
        log.info(userDAO.userLogIn("gildong@naver.com", "1234") + "");
    }


//    public UserVO selectProfile(String userEmail){
//        return userDAO.selectProfile(userEmail);
//    }
//    @Test
//    public void selectTest() throws Exception {
//        log.info(userDAO.selectProfile("APPLE").toString());
//    }
}
