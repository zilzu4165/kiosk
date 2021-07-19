package me.zilzu.kiosk.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Long userId;
    private String fingerPrint;

    public User(Long userId, String fingerPrint) {
        this.userId = userId;
        this.fingerPrint = fingerPrint;
    }
}
