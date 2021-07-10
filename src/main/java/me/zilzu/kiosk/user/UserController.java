package me.zilzu.kiosk.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/users")
    public void addUser(@RequestBody UserSaveRequest userSaveRequest) {
        userService.addUser(userSaveRequest);

        log.info("userAdd = {}", userSaveRequest);
    }

    @GetMapping(value = "/users/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }
}
