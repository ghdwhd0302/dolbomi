package com.project.dolbomi.service.member;

import com.project.dolbomi.domain.dao.AccReservationDAO;
import com.project.dolbomi.domain.dao.CareReservationDAO;
import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.CareReservationVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final AccReservationDAO accReservationDAO;
    private final CareReservationDAO careReservationDAO;

    /*AccReservationDAO*/


    /*@Override
    public void AccGetList(Long accReservationNum) {
        return accReservationDAO.AccGetList();
    }*/

    @Override
    public AccReservationVO AccGetList(Long accReservationNum) {
        return null;
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

    @Override
    public List<CareReservationVO> CareGetList(Long careReservationNum) {
        return careReservationDAO.CareGetList(careReservationNum);
    }


    //    -----------------------------------------------------------------
    /*CareReservationDAO*/


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
