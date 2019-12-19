package com.mxc.xlly.xllyservo.user.web;

import com.mxc.xlly.xllyservo.user.TUser;
import com.mxc.xlly.xllyservo.user.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tuser")
public class TUserWeb {

    @Autowired
    public TUserService service;

    @GetMapping("/findAll")
    public List<TUser> findAllUser(){
        List<TUser> list = service.findAll();
        for(TUser t : list){
            System.out.println(t.toString());
        }
        return list;
    }

}
