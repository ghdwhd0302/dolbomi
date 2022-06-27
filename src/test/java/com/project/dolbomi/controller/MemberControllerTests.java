package com.project.dolbomi.controller;

import com.project.dolbomi.controller.member.MemberController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class MemberControllerTests {

    //    마치 브라우저에서 URL을 요청한 것처럼 환경을 만들어준다.
    private MockMvc mockMvc;

    @Autowired
//    요청을 처리해주는 WebApplicationContext를 불러온다.
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }






    /*@Test
    public void checkTest() throws Exception {
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/user/user_userdetails").param("careReservationNum", "4")).andReturn().getModelAndView().getModelMap().toString());
    }*/

    /*@Test
    public void getTest() throws Exception {
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/member/profilechange").param("userEmail", "APPLE")).andReturn().getModelAndView().getModelMap().toString());

    }
*/

    @Test
    public void loginTests() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/member/loginM")
                .param("managerEmail", "apple")
                .param("managerPw", "1234"))
                .andReturn().getModelAndView().toString()
        );
    }




}
