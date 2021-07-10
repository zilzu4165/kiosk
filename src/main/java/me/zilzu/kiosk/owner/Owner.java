package me.zilzu.kiosk.owner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Owner {
    private Long ownerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String businessNumber;
    private String id;
    private String password;
//    private LoginInformation loginInformation;
//
//    public Owner(Long ownerId, String name, String email, String phoneNumber, String businessNumber, String id, String password) {
//        this.ownerId = ownerId;
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.businessNumber = businessNumber;
//        this.loginInformation = new LoginInformation(id, password);
//    }
}
