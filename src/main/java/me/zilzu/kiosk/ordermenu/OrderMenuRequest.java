package me.zilzu.kiosk.ordermenu;

import lombok.Data;

@Data
public class OrderMenuRequest {

    private Integer OrderMenuId;
    private Integer quantity;
    private Integer price;
    private Long orderId;
    private Long menuId;


    public OrderMenuRequest(Integer orderMenuId, Integer quantity, Integer price, Long orderId, Long menuId) {
        this.OrderMenuId = orderMenuId;
        this.quantity = quantity;
        this.price = price;
        this.orderId = orderId;
        this.menuId = menuId;
    }
}
