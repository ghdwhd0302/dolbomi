package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CareReservationVO {
    private Long careReservationNum;
    private String careReservationType;
    private String careReservationName;
    private String careReservationAge;
    private String careReservationPhoneNum;
    private String careReservationGender;
    private String careReservationAdd;
    private String careReservationRelation;
    private String careReservationAddress;
    private String careReservationHopeGender;
    private String careReservationDate;
    private String careReservationTime;
    private String careReservationAddRequire;
    private String careReservationPrice;
    private String careReservationStatus;
    private String userEmail;
}
