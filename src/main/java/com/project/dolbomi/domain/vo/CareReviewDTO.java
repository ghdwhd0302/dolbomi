package com.project.dolbomi.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class CareReviewDTO {
    private String careReservationType;
    private String careReservationDate;
    private String userName;
    private String userEmail;
    private Long careReservationNum;
    private Long userNum;


}
