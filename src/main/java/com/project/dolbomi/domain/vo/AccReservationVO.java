package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AccReservationVO {
    private Long accReservationNum;
    private String accReservationType;
    private String accReservationName;
    private String accReservationAge;
    private String accReservationPhoneNum;
    private String accReservationGender;
    private String accReservationAddPhoneNum;
    private String accReservationRelation;
    private String accReservationHopeGender;
    private String accReservationEndAddress;
    private String accReservationStartAddress;
    private String accReservationDate;
    private String accReservationTime;
    private String accReservationAddRequire;
    private String accReservationPrice;
    private String accReservationStatus;
    private String userEmail;
}