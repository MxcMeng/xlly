package com.mxc.xlly.xllyservo.user.service;

import com.mxc.xlly.xllyservo.user.TUser;
import com.mxc.xlly.xllyservo.user.dao.TUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TUserService {

    @Autowired
    private TUserDao dao;

    public List<TUser> findAll(){
        return dao.findAll();
    }

}
