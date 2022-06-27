package com.project.dolbomi.service;

import com.project.dolbomi.domain.vo.UserVO;
import com.project.dolbomi.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class UserServiceTests {
    @Autowired
    private UserService userService;

   /* @Test
    public void joinTest(){
        UserVO userVO = new UserVO();
        userVO.setUserName("새로운");
        userVO.setUserBirth("20000101");
        userVO.setUserGender("M");
        userVO.setUserEmail("newman2@gmail.com");
        userVO.setUserPw("1234");
        userVO.setUserAddress("서울시 강남구");
        userVO.setUserPhoneNum("010-1234-1234");

        userService.join(userVO);
        log.info("추가된 userEmail : " + userVO.getUserEmail());

    }
*/


}