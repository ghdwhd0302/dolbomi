package com.project.dolbomi.service;

import com.project.dolbomi.domain.vo.AccReservationVO;
import com.project.dolbomi.domain.vo.CareReservationVO;
import com.project.dolbomi.service.member.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class MemberServiceTests {
    @Autowired
    private MemberService memberService;

    /*@Test
    public void careInsertTests(){
        CareReservationVO careReservationVO = new CareReservationVO();

        careReservationVO.setCareReservationType("아이돌봄");
        careReservationVO.setCareReservationName("짱구");
        careReservationVO.setCareReservationAge("7");
        careReservationVO.setCareReservationPhoneNum("01012341234");
        careReservationVO.setCareReservationGender("W");
        careReservationVO.setCareReservationAddPhoneNum("01023452345");
        careReservationVO.setCareReservationRelation("어머니");
        careReservationVO.setCareReservationAddress("서울특별시");
        careReservationVO.setCareReservationHopeGender("W");
        careReservationVO.setCareReservationDate("2022-03-12-15-20");
        careReservationVO.setCareReservationTime("4");
        careReservationVO.setCareReservationAddRequire("잘부탁드립니다.");
        careReservationVO.setCareReservationPrice("220000");
        careReservationVO.setUserEmail("epple");

        memberService.careReservation(careReservationVO);
    }*/

    /*@Test
    public void accInsertTests(){
        AccReservationVO accReservationVO = new AccReservationVO();

        accReservationVO.setAccReservationPhoneNum("01054719297");
        accReservationVO.setAccReservationAddRequire("잘 봐주세요!");
        accReservationVO.setAccReservationEndAddress("서울시");
        accReservationVO.setAccReservationStartAddress("수원시");
        accReservationVO.setAccReservationAge("11");
        accReservationVO.setAccReservationTime("2");
        accReservationVO.setUserEmail("epple");
        accReservationVO.setAccReservationName("맹구");
        accReservationVO.setAccReservationAddPhoneNum("010012129312");
        accReservationVO.setAccReservationDate("2022-02-21-12-00");
        accReservationVO.setAccReservationGender("M");
        accReservationVO.setAccReservationHopeGender("M");
        accReservationVO.setAccReservationPrice("4000");
        accReservationVO.setAccReservationType("기타동행");
        accReservationVO.setAccReservationRelation("아버지");

        memberService.accReservation(accReservationVO);
    }*/
}
