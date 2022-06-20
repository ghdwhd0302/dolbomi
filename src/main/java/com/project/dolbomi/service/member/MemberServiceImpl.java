package com.project.dolbomi.service.member;

import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.CareReservationVO;
import com.project.dolbomi.domain.vo.ReviewVO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    /*AccReservationDAO*/
    @Override
    public void AccGetList() {

    }

    @Override
    public void accReservation(AccReservationVO accReservationVO) {

    }

    @Override
    public void accReservationInfo(Long accReservationNum) {

    }

    @Override
    public void accRemove(Long accReservationNum) {

    }

//    -----------------------------------------------------------------
    /*CareReservationDAO*/
    @Override
    public void careGetList() {

    }

    @Override
    public void careReservation(CareReservationVO careReservationVO) {

    }

    @Override
    public void careReservationInfo(Long careReservationNum) {

    }

    @Override
    public void careRemove(Long careReservationNum) {

    }

//    --------------------------------------------------------------------
    /*ReviewDAO*/
    @Override
    public void reviewGetList() {

    }

    @Override
    public void register(ReviewVO reviewVO) {

    }

    @Override
    public void findByReviewNum(Long reviewNum) {

    }

    @Override
    public void modify(ReviewVO reviewVO) {

    }

    @Override
    public void reviewRemove(Long reviewNum) {

    }

    @Override
    public void getTotal() {

    }
}
