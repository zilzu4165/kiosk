package me.zilzu.kiosk.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserSaveRequest {
    private Long userId;
    private String fingerPrint;

    public UserSaveRequest(Long userId, String fingerPrint) {
        this.userId = userId;
        this.fingerPrint = fingerPrint;
    }
}
