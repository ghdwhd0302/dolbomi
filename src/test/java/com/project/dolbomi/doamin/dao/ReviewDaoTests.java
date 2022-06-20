package com.project.dolbomi.doamin.dao;

import com.project.dolbomi.domain.dao.ReviewDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ReviewDaoTests {
    @Autowired
    private ReviewDAO reviewDAO;

}
