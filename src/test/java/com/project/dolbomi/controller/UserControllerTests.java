package com.project.dolbomi.controller;

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
public class UserControllerTests {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setUp(){ mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); }

//    @Test
//    public void insertTests() throws Exception{
//        mockMvc.perform(MockMvcRequestBuilders.post("/user/reservAcc")
//        .param("accReservationType", "아이동행")
//        .param("userEmail", "bpple")
//        .param("accReservationName", "이순신")
//        .param("accReservationAge", "8")
//        .param("accReservationPhoneNum", "01022222222")
//        .param("accReservationGender", "M")
//        .param("accReservationAddPhoneNum", "01022221111")
//        .param("accReservationRelation", "아버지")
//        .param("accReservationHopeGender", "W")
//        .param("accReservationEndAddress", "수원")
//        .param("accReservationStartAddress", "서울")
//        .param("accReservationDate", "2022-11-23-12-23")
//        .param("accReservationTime", "3")
//        .param("accReservationAddRequire", "잘부탁드립니다")
//        .param("accReservationPrice", "20000")).andReturn().toString();
//    }
    /*@Test
    public void insertTests() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/user/reservCare")
        .param("careReservationType", "어르신 돌봄")
        .param("userEmail", "cpple")
        .param("careReservationName", "장보고")
        .param("careReservationAge", "78")
        .param("careReservationPhoneNum", "01011112222")
        .param("careReservationGender", "M")
        .param("careReservationAddPhoneNum", "01022221111")
        .param("careReservationRelation", "아들")
        .param("careReservationHopeGender", "M")
        .param("careReservationAddress", "인천")
        .param("careReservationDate", "2022-11-23-12-23")
        .param("careReservationTime", "3")
        .param("careReservationAddRequire", "잘부탁드립니다.")
        .param("careReservationPrice", "20000")).andReturn().toString();
    }*/




//    @Test
//    public void getListTests() throws Exception{
//        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/user/user_userdetails").param("careReservationNum", "7")).andReturn().getModelAndView().getViewName());
//    }
}
