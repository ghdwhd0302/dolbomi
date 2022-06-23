package com.project.dolbomi.service.member;

import com.project.dolbomi.domain.dao.AccReservationDAO;
import com.project.dolbomi.domain.dao.CareReservationDAO;
import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.CareReservationVO;
import com.project.dolbomi.domain.vo.ReviewVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final AccReservationDAO accReservationDAO;
    private final CareReservationDAO careReservationDAO;

    /*AccReservationDAO*/
    @Override
    public void AccGetList() {

    }

    @Override
    public void accReservation(AccReservationVO accReservationVO) {
        accReservationDAO.accReservation(accReservationVO);
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
        careReservationDAO.careReservation(careReservationVO);
    }

    @Override
    public void careReservationInfo(Long careReservationNum) {

    }

    @Override
    public void careRemove(Long careReservationNum) {

    }

//    --------------------------------------------------------------------



}
