package com.mxc.xlly.xllyservo.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@ToString
public class TUser {

    private Long id;
    private String username;
    private String password;

}
