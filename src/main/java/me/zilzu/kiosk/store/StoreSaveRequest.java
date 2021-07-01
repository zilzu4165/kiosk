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
}

