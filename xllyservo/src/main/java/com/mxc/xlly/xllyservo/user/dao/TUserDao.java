package com.mxc.xlly.xllyservo.user.dao;

import com.mxc.xlly.xllyservo.user.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TUserDao {

    @Select("select * from tuser")
    List<TUser> findAll();

}
