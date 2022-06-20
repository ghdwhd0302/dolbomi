package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserVO {
    private String userName;
    private String userGender;
    private String userBirth;
    private String userEmail;
    private String userPhoneNum;
    private String userPw;
}
