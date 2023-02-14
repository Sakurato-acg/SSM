package com.atguigu.mapper;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface UserMapper {
    @Select("select id, username, password from user where username=#{user.username} and password=#{user.password}")
    public User select(@Param("user") User user);

    @Update("insert into user(username, password,email) values (#{user.username},#{user.password},#{user.email})")
    public void update(@Param("user") User user);

    @Select("select username from user where username=#{username}")
     public String selectName(@Param("username") String username);

    @Select("select email from user where email=#{email}")
     public String selectEmail(@Param("email") String email);

    @Update("update anime_library.user set password=#{user.password}  where email=#{user.email}")
    public void reSet(@Param("user") User user);
}
