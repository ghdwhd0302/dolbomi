package com.project.dolbomi.mapper;

import com.project.dolbomi.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertTest(){
        UserVO userVO = new UserVO();
        userVO.setUserName("새로운");
        userVO.setUserBirth("20000101");
        userVO.setUserGender("M");
        userVO.setUserEmail("newman@gmail.com");
        userVO.setUserPw("1234");
        userVO.setUserAddress("서울시 강남구");
        userVO.setUserPhoneNum("010-1234-1234");

        userMapper.insert(userVO);
        log.info("추가된 userEmail : " + userVO.getUserEmail());

    }


}
