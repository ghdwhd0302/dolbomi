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
    private UserVO userVO;

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



    /*@Test
    public void updateTest(){
        UserVO userVO=userMapper.selectProfile("APPLE");

        userVO.setUserName("강남");
        userVO.setUserBirth("19991222");
        userVO.setUserPw("asdasd");

    }*/
    /*@Test
    public void updateTest(){
        UserVO userVO=userMapper.selectProfile("APPLE");
        log.info(String.valueOf(userVO));
        userVO.setUserName("강남동");
        userVO.setUserBirth("19991222");
        userVO.setUserPw("asdasd");
        log.info(String.valueOf(userVO));
    }*/
   /* @Test
    public void deleteTest(){


        log.info(userMapper.delete("APPLE"));

    }*/
    /*@Test
    public void getUserTest(){
        log.info(userMapper.selectProfile("APPLE"));
    }*/

    @Test
    public void getUserTest(){

        log.info(userMapper.selectProfile("APPLE").toString());
    }

}
