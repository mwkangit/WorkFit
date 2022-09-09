package com.workfit.dto.member.signin;

import com.workfit.domain.BodyInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginMemberSuccessRequest {
    private BodyInfo bodyInfo;
}
