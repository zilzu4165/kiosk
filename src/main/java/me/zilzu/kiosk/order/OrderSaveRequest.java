package me.zilzu.kiosk.order;

import lombok.Data;

@Data
public class OrderSaveRequest {
    private Long orderId;
    private Integer totalPrice;
    //    private String orderTime;  --> default = now()
    private char takeOut;
    private String paymentMethod;
    private Long userId;
    private Long storeId;
}
