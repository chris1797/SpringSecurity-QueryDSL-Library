package com.security.demo.domain.entity;

import com.security.demo.common.role.Role;
import com.security.demo.common.role.Role_withdraw;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;


@Getter
@Entity
@Component
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long memberNo;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false, name = "account_no")
    private String accountNo;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role account_type;

    @Enumerated(EnumType.STRING)
    private Role_withdraw quit;


    @Builder
    public Member(String nickname, String accountNo, String password, Role account_type, Role_withdraw quit) {
        this.accountNo = accountNo;
        this.nickname = nickname;
        this.password = password;
        this.account_type = account_type;
        this.quit = quit;
    }
}
