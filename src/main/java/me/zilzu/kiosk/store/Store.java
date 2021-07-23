package me.zilzu.kiosk.store;

import lombok.Getter;

@Getter
public class Store {
    private Long storeId;
    private String storeName;
    private String location;
    private String tel;
    private String openTime;
    private String closeTime;
    private Long ownerId;

}
