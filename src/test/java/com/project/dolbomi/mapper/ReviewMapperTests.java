package com.project.dolbomi.mapper;

import com.project.dolbomi.domain.vo.ReviewVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ReviewMapperTests {
    @Autowired
    private ReviewMapper reviewMapper;

//    @Test
//    public void getListTest() {
//        reviewMapper.getList().stream().map(ReviewVO::toString).forEach(log::info);
//
//    }


//    @Test
//    public void insertTest(){
//        ReviewVO reviewVO = new ReviewVO();
//        reviewVO.setReviewTitle("새롭게 추가된 게시글 제목1");
//        reviewVO.setReviewContent("새롭게 추가된 게시글 내용1");
//        reviewVO.setReviewWriter("new1");
//        reviewMapper.insert(reviewVO);
//        log.info("추가된 게시글 번호 : " + reviewVO.getReviewNum());
//    }


//    @Test
//    public void selectTest(){
//        log.info(reviewMapper.select(1L).toString());
//    }

    @Test
    public void updateTest(){
        ReviewVO reviewVO = reviewMapper.select(1L);
        reviewVO.setReviewTitle("수정된 게시글 제목");
        reviewVO.setReviewContent("수정된 게시글 내용");

        log.info("UPDATE COUNT : " + reviewMapper.update(reviewVO));
    }

//    @Test
//    public void deleteTest(){
//        log.info("DELETE COUNT : " + reviewMapper.delete(1L));
//    }

//    @Test
//    public void getTotalTest(){
//        log.info("총 게시글 : " + reviewMapper.getTotal());
//    }




}
