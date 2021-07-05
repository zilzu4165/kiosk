package me.zilzu.kiosk.menu;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MenuSaveRequest {

    private Long menuId;
    private String type;
    private String name;
    private Integer price;
    private String imageUrl;

    public MenuSaveRequest(Long menuId, String type, String name, Integer price, String imageUrl) {
        this.menuId = menuId;
        this.type = type;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }
}
