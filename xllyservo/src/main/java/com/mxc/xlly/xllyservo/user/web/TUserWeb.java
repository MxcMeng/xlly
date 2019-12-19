package com.mxc.xlly.xllyservo.user.web;

import com.mxc.xlly.xllyservo.user.TUser;
import com.mxc.xlly.xllyservo.user.service.TUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("用户")
@RestController
@RequestMapping("/tuser")
public class TUserWeb {

    @Autowired
    public TUserService service;

    @GetMapping("/findAll")
    @ApiOperation("查询所有")
    public List<TUser> findAllUser(){
        List<TUser> list = service.findAll();
        for(TUser t : list){
            System.out.println(t.toString());
        }
        return list;
    }

}
