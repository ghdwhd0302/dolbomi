package com.project.dolbomi.service;

import com.project.dolbomi.service.manager.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ManagerServiceTests {
    @Autowired
    private ManagerService managerService;

    @Test
    public void managerloginTests(){
        log.info(managerService.managerLogIn("apple", "1234") + "");
    }
}
