package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    long getUser(String userName,String passWord);
}
