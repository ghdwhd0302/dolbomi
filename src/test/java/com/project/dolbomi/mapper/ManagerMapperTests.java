package com.project.dolbomi.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ManagerMapperTests {
    @Autowired
    private ManagerMapper managerMapper;

//    @Test
//    public void accgetList() {
//        ManagerMapper.accgetList().stream().map(ManagerVO::toString).forEach(log::info);
//    }
//    @Test
//    public void caregetList() {
//        ManagerMapper.caregetList().stream().map(ManagerVO::toString).forEach(log::info);
//    }

    @Test
    public void managerloginTests(){
        log.info(managerMapper.managerLogIn("apple", "1234")+"");
    }

}
