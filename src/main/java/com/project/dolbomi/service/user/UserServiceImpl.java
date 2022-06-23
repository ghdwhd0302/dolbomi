package com.project.dolbomi.service.user;

import com.project.dolbomi.domain.dao.ReviewDAO;
import com.project.dolbomi.domain.dao.UserDAO;
import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.ReviewVO;
import com.project.dolbomi.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    private final ReviewDAO reviewDAO;


    @Override
    public void careApprove(long careReservationNum) {

    }

    @Override
    public void careRefuse(long careReservationNum) {

    }

    @Override
    public void accApprove(long accReservationNum) {

    }

    @Override
    public void accRefuse(long accReservationNum) {

    }

    @Override
    public void join(UserVO userVO) {

    }

    @Override
    public void withdrawal(String userEmail) {

    }

    @Override
    public void profile(String userEmail) {

    }

    @Override
    public void modify(UserVO userVO) {

    }

    @Override
    public List<UserVO> getList(Criteria criteria) {
        return null;
    }


    @Override
    public int getTotal() {
        return userDAO.getTotal();
    }

    /*ReviewDAO*/
    @Override
    public List<ReviewVO> reviewGetList() {return reviewDAO.reviewGetList();}

    @Override
    public void register(ReviewVO reviewVO) {reviewDAO.register(reviewVO);}

    @Override
    public ReviewVO get(Long reviewNum) {
        return reviewDAO.findByReviewNum(reviewNum);
    }

    //@Override
    //public ReviewVO findByReviewNum(Long reviewNum) {
    //    return reviewDAO.findByReviewNum(reviewNum);
    //}

    @Override
    public boolean modify(ReviewVO reviewVO) {
        return reviewDAO.modify(reviewVO);
    }

    @Override
    public boolean reviewRemove(Long reviewNum) {
        return reviewDAO.reviewRemove(reviewNum);
    }

    @Override
    public int reviewGetTotal() {
        return reviewDAO.reviewGetTotal();
    }
}
