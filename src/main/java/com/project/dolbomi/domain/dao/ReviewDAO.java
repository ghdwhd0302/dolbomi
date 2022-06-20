package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.ReviewVO;
import com.project.dolbomi.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReviewDAO {
    private final ReviewMapper reviewMapper;

    //    게시글 목록
    public void reviewGetList(){

    }
    //    게시글 추가
    public void register(ReviewVO reviewVO){

    }
    //    게시글 한 개 가져오기
    public void findByReviewNum(Long reviewNum){

    }
    //    게시글 수정
    public void modify(ReviewVO reviewVO){

    }
    //    게시글 삭제
    public void reviewRemove(Long reviewNum){

    }
    //    게시글 전체 개수
    public void getTotal(){

    }

}
