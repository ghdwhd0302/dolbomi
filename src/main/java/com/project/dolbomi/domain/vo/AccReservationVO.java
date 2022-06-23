package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AccReservationVO {
    private Long accReservationNum; /*동행 예약번호*/
    private String accReservationType; /*동행 서비스 종류*/
    private String accReservationName; /*이름*/
    private String accReservationAge; /*나이*/
    private String accReservationPhoneNum; /*핸드폰번호*/
    private String accReservationGender; /*성별*/
    private String accReservationAddPhoneNum; /*추가 연락처*/
    private String accReservationRelation; /*관계*/
    private String accReservationHopeGender; /*희망 성별*/
    private String accReservationEndAddress; /*도착지*/
    private String accReservationStartAddress; /*출발지*/
    private String accReservationDate; /*예약날짜*/
    private String accReservationTime;  /*이용시간*/
    private String accReservationAddRequire; /*요청사항*/
    private String accReservationPrice; /*가격*/
    private String accReservationStatus; /*예약 상태*/
    private String userEmail; /*사용자 이메일*/
}