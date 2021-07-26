package me.zilzu.kiosk.ordermenu;

import lombok.Data;

@Data
public class OrderMenu {
    private int quantity;
    private int price;
    private Long orderId;
    private Long menuId;

}
