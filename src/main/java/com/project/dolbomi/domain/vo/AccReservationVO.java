package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AccReservationVO {
    private Long accreservationNum;
    private String accreservationType;
    private String accreservationName;
    private String accreservationAge;
    private String accreservationPhoneNum;
    private String accreservationGender;
    private String accreservationAddPhoneNum;
    private String accreservationRelation;
    private String accreservationHopeGender;
    private String accreservationAddress;
    private String accreservationDate;
    private String accreservationTime;
    private String accreservationAddRequire;
    private String accreservationPrice;
    private String userEmail;
}