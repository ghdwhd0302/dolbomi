package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User4AccDTO {
    private String accReservationNum;
    private String accReservationType;
    private String accReservationName;
    private String accReservationDate;
    private String accReservationTime;
    private String accReservationStartAddress;
    private String accReservationEndAddress;
    private String accReservationPrice;
    private String accReservationPhoneNum;
    private String managerName;
    private String managerPhoneNum;
    private String managerGender;
    private String managerDriveOk;
    private String managerRegion;
}
