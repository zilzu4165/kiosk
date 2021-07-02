package me.zilzu.kiosk.owner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginInformation {
    private String id;
    private String password;

    public LoginInformation(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
