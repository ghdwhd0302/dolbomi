package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User4CareDTO {
    private String careReservationNum;
    private String careReservationType;
    private String careReservationName;
    private String careReservationDate;
    private String careReservationTime;
    private String careReservationAddress;
    private String careReservationPrice;
    private String managerName;
    private String managerPhoneNum;
    private String managerGender;
    private String managerDriveOk;
    private String managerRegion;
}
