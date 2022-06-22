package com.project.dolbomi.service.user;

import com.project.dolbomi.domain.dao.UserDAO;
import com.project.dolbomi.domain.vo.Criteria;
import com.project.dolbomi.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;


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
}
