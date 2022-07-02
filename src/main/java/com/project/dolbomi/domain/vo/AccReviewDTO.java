package com.project.dolbomi.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class AccReviewDTO {
    private String accReservationType;
    private String accReservationDate;
    private String userName;
    private String userEmail;
    private Long accReservationNum;
    private Long userNum;


}
