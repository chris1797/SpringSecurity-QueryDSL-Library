package com.security.demo.dto;

import com.security.demo.entity.Role_withdraw;
import com.security.demo.entity.Role;
import com.security.demo.entity.Member;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Data
@Component("MemberDTO")
public class MemberDTO {

    private String memberid;
    private String nickname;
    private String password;
    private Role account_type;
    private Role_withdraw rolewithdraw;


    public Member toEntity() {
        return Member.builder()
                .memberid(memberid)
                .nickname(nickname)
                .password(password)
                .account_type(account_type)
                .build();
    }
}
