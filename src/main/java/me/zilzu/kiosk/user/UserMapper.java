package me.zilzu.kiosk.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void addUser(UserSaveRequest userSaveRequest);

    User getUser(Long userId);
}