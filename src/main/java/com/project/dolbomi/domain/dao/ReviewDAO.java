package com.project.dolbomi.domain.dao;

import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.ReviewVO;
import com.project.dolbomi.domain.vo.UserReviewDTO;
import com.project.dolbomi.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewDAO {
    private final ReviewMapper reviewMapper;

    //    게시글 목록
    public List<ReviewVO> reviewGetList(Criteria criteria) {
        return reviewMapper.reviewGetList(criteria);
    }

    //    게시글 추가
    public void register(ReviewVO reviewVO) {
        reviewMapper.insert(reviewVO);
    }

    //    게시글 한 개 가져오기
    public ReviewVO findByReviewNum(Long reviewNum) {
        return reviewMapper.select(reviewNum);
    }

    //    게시글 수정
    public boolean modify(ReviewVO reviewVO) {
        return reviewMapper.update(reviewVO) == 1;
    }

    //    게시글 삭제
    public boolean reviewRemove(Long reviewNum) {
        return reviewMapper.delete(reviewNum) == 1;
    }

    //    게시글 전체 개수
    public int reviewGetTotal(Criteria criteria) {
        return reviewMapper.reviewGetTotal(criteria);
    }

    //    회원 게시글 전체 개수
    public int myReviewGetTotal(Criteria criteria, String userEmail) {
        return reviewMapper.myReviewGetTotal(criteria, userEmail);
    }

    // 회원 게시글 목록
    public List<UserReviewDTO> reviewGetListUser(Criteria criteria, String userEmail) {
        return reviewMapper.reviewGetListUser(criteria, userEmail);
    }

}
