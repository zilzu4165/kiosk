package me.zilzu.kiosk.ordermenu;

import lombok.Data;

@Data
public class OrderMenu {
    // 수량과 가격에 대해
    // 비즈니스 로직 필요

    private Integer quantity;
    private Integer price;
    private Long orderId;
    private Long menuId;

}
