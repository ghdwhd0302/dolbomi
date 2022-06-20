package com.project.dolbomi.mapper;

import com.project.dolbomi.domain.vo.AccReservationVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AccreservationMapperTests {
    @Autowired
    private AccReservationMapper accReservationMapper;


//    @Test
//    public void getListTest() {
//        accReservationMapper.getList().stream().map(AccReservationVO::toString).forEach(log::info);
//    }









    /*@Test
    public AccReservationVO select(){
        accReservationMapper.select();
    }
*/

}