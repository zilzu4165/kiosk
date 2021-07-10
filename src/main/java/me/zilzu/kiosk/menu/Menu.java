package me.zilzu.kiosk.menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Menu {
    private Long menuId;
    private String type;
    private String name;
    private Integer price;
    private String imageUrl;
}
