package com.project.dolbomi.mapper;

import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.ReviewVO;
import com.project.dolbomi.domain.vo.UserReviewDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReviewMapper {
    //    게시글 목록
    public List<ReviewVO> reviewGetList(Criteria criteria);

    //    게시글 추가
    public void insert(ReviewVO reviewVO);

    //    게시글 한 개 가져오기
    public ReviewVO select(Long reviewNum);

    //    게시글 수정
    public int update(ReviewVO reviewVO);

    //    게시글 삭제
    public int delete(Long reviewNum);

    //    게시글 전체 개수
    public int reviewGetTotal(Criteria criteria);

    // 회원 게시글 전체 개수
    public int myReviewGetTotal(@Param("criteria") Criteria criteria, @Param("userEmail") String userEmail);

    // 회원 게시글 목록
    public List<UserReviewDTO> reviewGetListUser(@Param("criteria") Criteria criteria, @Param("userEmail") String userEmail);


}
