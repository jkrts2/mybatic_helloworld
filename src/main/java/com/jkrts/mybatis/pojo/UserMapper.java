package com.jkrts.mybatis.pojo;

public interface UserMapper {
/*
* 添加用户信息
* @return
* */
    int insertUser();
/*
* 修改用户信息
*
* */
    void updateUser();
    /*
    * 删除用户信息
    * */
    void deleteUser();
}
