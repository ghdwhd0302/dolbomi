package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ManagerVO {
    private String managerName;
    private String managerBirth;
    private String managerEmail;
    private String managerGender;
    private String managerDriveOk;
    private String managerPhoneNum;
    private String managerAddress;
    private String managerCareer;
    private String managerPw;
    private String managerStatus;
}

