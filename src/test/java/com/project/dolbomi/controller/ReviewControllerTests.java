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
public class ReviewControllerTests {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getListTest() throws Exception {      // 가져온다의 get이 아니라 매서드 이름이 get
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/user/review")).andReturn().getModelAndView().getModelMap().toString());
    }   //                                                                         -> enter의 key event를 자바에서는 return

//    @Test
//    public void registerTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/user/review2")
//                .param("reviewTitle", "테스트 새 글 제목")
//                .param("reviewContent", "테스트 새 글 내용")
//                .param("reviewWriter", "hds1234")).andReturn().getFlashMap().toString());
//    } //                                                                    -> boardcontreller에서 addFlashAttribute로 담아줬기때문에

//    /*게시글 상세보기*/
//    @Test
//    public void readTest() throws Exception{
//        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/user/readReview").param("reviewNum", "103")).andReturn().getModelAndView().getModelMap().toString());
//    }

//    @Test
//    public void modifyTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/user/modifyReview")
//                .param("reviewNum", "103")
//                .param("reviewTitle", "수정된 게시글 제목")
//                .param("reviewContent", "수정된 게시글 내용")).andReturn().getModelAndView().getModelMap().toString());
//    }

//    @Test
//    public void removeTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/user/reviewRemove").param("reviewNum", "103")).andReturn().getModelAndView().getViewName());
//    }


}

