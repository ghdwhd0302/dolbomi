package com.project.dolbomi.service.manager;

import com.project.dolbomi.domain.dao.ManagerDAO;
import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.ManagerVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    private final ManagerDAO managerDAO;

    @Override
    public void accGetList() {

    }

    @Override
    public void careGetList() {

    }

    @Override
    public void accApply(long accReservationNum) {

    }

    @Override
    public void careApply(long careReservationNum) {

    }

    @Override
    public void withdrawal(String userEmail) {

    }

    @Override
    public List<ManagerVO> getList(Criteria criteria) {
        return null;
    }

    @Override
    public int getTotal() {
        return managerDAO.getTotal();
    }

    @Override
    public ManagerVO getManagerPro(String userEmail) {
        return null;
    }
}
