package com.project.dolbomi.mapper;




import com.project.dolbomi.domain.vo.CareReservationVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class CarereservationMapperTests {
    @Autowired
    private CareReservationMapper careReservationMapper;


//    @Test
//    public void getListTest() {
//        careReservationMapper.getList().stream().map(CareReservationVO::toString).forEach(log::info);
//    }



}
