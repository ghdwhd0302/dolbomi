package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReviewVO {
    private Long reviewNum;
    private String reviewType;
    private String reviewTitle;
    private String reviewContent;
    private String reviewWriter;
    private String reviewScore;
    private String reviewDate;
    private String reviewUpdateDate;
    private String userEmail;
}
