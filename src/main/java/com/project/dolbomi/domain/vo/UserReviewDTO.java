package com.project.dolbomi.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class UserReviewDTO {
    private Long reviewNum;
    private String userEmail;
    private Long userNum;
    private String userName;
    private String reviewType;
    private String reviewTitle;
    private String reviewDate;
    private String reviewContent;
    private String reviewUpdateDate;

    public UserReviewDTO(Criteria criteria, List<UserReviewDTO> reviewGetListUser) {
    }
}