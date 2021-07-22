package me.zilzu.kiosk.order;

import lombok.Data;

@Data
public class OrderSaveRequest {
    private Long orderId;
    private Integer totalPrice;
    //    private String orderTime;  --> default = now()
    private Boolean isTakeOut;
    private String paymentMethod;
    private Long userId;
    private Long storeId;

    public Order toOrder() {
        return Order.builder()
                .orderId(orderId)
                .totalPrice(totalPrice)
                .takeOut(isTakeOut ? 'Y' : 'N') // isTakeOut = true --> Y / isTakeOut = false --> N
                .paymentMethod(paymentMethod)
                .userId(userId)
                .storeId(storeId)
                .build();
    }

    public OrderSaveRequest(Long orderId, Integer totalPrice, Boolean isTakeOut, String paymentMethod, Long userId, Long storeId) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.isTakeOut = isTakeOut;
        this.paymentMethod = paymentMethod;
        this.userId = userId;
        this.storeId = storeId;
    }
}
