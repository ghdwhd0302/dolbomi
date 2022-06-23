package com.project.dolbomi.doamin.dao;

import com.project.dolbomi.domain.dao.AccReservationDAO;
import com.project.dolbomi.domain.vo.AccReservationVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AccReservationDaoTests {
    @Autowired
    private AccReservationDAO accReservationDAO;

   /*@Test
    public void insertTest(){
        AccReservationVO accReservationVO = new AccReservationVO();
        accReservationVO.setAccReservationPhoneNum("01054719297");
        accReservationVO.setAccReservationAddRequire("잘 봐주세요!");
        accReservationVO.setAccReservationEndAddress("안산시");
        accReservationVO.setAccReservationStartAddress("수원시");
        accReservationVO.setAccReservationAge("11");
        accReservationVO.setAccReservationTime("2");
        accReservationVO.setUserEmail("cpple");
        accReservationVO.setAccReservationName("김철수");
        accReservationVO.setAccReservationAddPhoneNum("010012129312");
        accReservationVO.setAccReservationDate("2000-02-21-12-00");
        accReservationVO.setAccReservationGender("W");
        accReservationVO.setAccReservationHopeGender("W");
        accReservationVO.setAccReservationPrice("2000");
        accReservationVO.setAccReservationType("기타동행");
        accReservationVO.setAccReservationRelation("아버지");

        accReservationDAO.accReservation(accReservationVO);
    }*/
}
