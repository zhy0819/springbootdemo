package com.offcn.springbootdemo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "userbody")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBody {
    private String name;
    private String password;
    private String birthday;
    private String mobile;
    private String address;
}
