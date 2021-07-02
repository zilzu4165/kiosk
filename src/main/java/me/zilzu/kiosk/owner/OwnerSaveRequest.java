package me.zilzu.kiosk.owner;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnerSaveRequest {

    private Long ownerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String businessNumber;
    private String id;
    private String password;

    public Owner toOwner() {
        return new Owner(
                ownerId,
                name,
                email,
                phoneNumber,
                businessNumber,
                id,
                password);
    }
}
