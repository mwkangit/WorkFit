package com.workfit.dto.member.signin;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //모든 필드값을 이용한 생성자
public class LoginMemberErrorRequest {

    private String msg;
}
