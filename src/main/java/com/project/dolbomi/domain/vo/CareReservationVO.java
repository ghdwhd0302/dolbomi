package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CareReservationVO {
    private Long carereservationNum;
    private String carereservationType;
    private String carereservationName;
    private String carereservationAge;
    private String carereservationPhoneNum;
    private String carereservationGender;
    private String carereservationAdd;
    private String carereservationRelation;
    private String carereservationAddress;
    private String carereservationHopeGender;
    private String carereservationDate;
    private String carereservationTime;
    private String carereservationAddRequire;
    private String carereservationPrice;
    private String userEmail;
}
