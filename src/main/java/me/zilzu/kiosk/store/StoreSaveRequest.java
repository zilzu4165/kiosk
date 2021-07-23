package me.zilzu.kiosk.store;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StoreSaveRequest {
    private Long id;
    private String storeName;
    private String location;
    private String tel;
    private String openTime;
    private String closeTime;
    private Long ownerId;

    public StoreSaveRequest(Long storeId, String storeName, String location, String tel, String openTime, String closeTime, Long ownerId) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.tel = tel;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.ownerId = ownerId;
    }
}
