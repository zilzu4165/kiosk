package me.zilzu.kiosk.order;

import lombok.Data;

@Data
public class Order {
    private Long OrderId;
    private Integer totalPrice;
    private String orderTime;
    private char takeOut;
    private String paymentMethod;
    private Long userId;
    private Long StoreId;
}
