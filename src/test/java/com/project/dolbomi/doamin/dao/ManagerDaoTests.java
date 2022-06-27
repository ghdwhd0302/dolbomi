package com.project.dolbomi.doamin.dao;

import com.project.dolbomi.domain.dao.ManagerDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ManagerDaoTests {
    @Autowired
    private ManagerDAO managerDAO;

/*    @Test
    public void loginTests(){
        log.info(managerDAO.managerLogIn("apple", "1234")+"");
    }*/
}
