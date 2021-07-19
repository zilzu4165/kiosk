package me.zilzu.kiosk.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void addUser(UserSaveRequest userSaveRequest) {
        userMapper.addUser(userSaveRequest);
    }

    public User getUser(Long userId) {
        return userMapper.getUser(userId);
    }
}
