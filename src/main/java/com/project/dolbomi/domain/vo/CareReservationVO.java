package com.project.dolbomi.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CareReservationVO {
    private Long careReservationNum; /*돌봄 예약번호*/
    private String careReservationType; /*돌봄 서비스 종류*/
    private String careReservationName; /*이름*/
    private String careReservationAge; /*나이*/
    private String careReservationPhoneNum; /*핸드폰 번호*/
    private String careReservationGender; /*성별*/
    private String careReservationAddPhoneNum; /*추가 연락처*/
    private String careReservationRelation; /*관계*/
    private String careReservationAddress; /*주소*/
    private String careReservationHopeGender; /*희망 성별*/
    private String careReservationDate; /*예약날짜*/
    private String careReservationTime; /*서비스 이용 시간*/
    private String careReservationAddRequire; /*요청사항*/
    private String careReservationPrice; /*가격*/
    private String careReservationStatus; /*예약상태*/
    private String userEmail; /*사용자 이메일*/
    private String managerEmail; /*매니저 이메일*/
}
