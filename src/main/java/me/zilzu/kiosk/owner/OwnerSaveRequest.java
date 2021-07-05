package me.zilzu.kiosk.owner;


import lombok.*;

@Data
public class OwnerSaveRequest {

    private Long ownerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String businessNumber;
    private String id;
    private String password;

    public OwnerSaveRequest(Long ownerId, String name, String email, String phoneNumber, String businessNumber, String id, String password) {
        this.ownerId = ownerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.businessNumber = businessNumber;
        this.id = id;
        this.password = password;
    }

    //    public Owner toOwner() {
//        return new Owner(
//                ownerId,
//                name,
//                email,
//                phoneNumber,
//                businessNumber,
//                id,
//                password);
//    }
}
