package com.zaritalk.demo.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TokenResponse {

    private String accessToken;
    private String tokenType;

}
