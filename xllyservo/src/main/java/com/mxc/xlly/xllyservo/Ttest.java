package com.mxc.xlly.xllyservo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class Ttest {

    private String tt = "test";

    @GetMapping("/te")
    public String test(){
        System.out.println(tt);
        return tt;
    }

}
