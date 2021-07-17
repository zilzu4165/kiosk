package me.zilzu.kiosk.order;

import lombok.Data;

@Data
public class OrderSaveRequest {
    private Long orderId;
    private Integer totalPrice;
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

    ///////////////////////////
    // 미국, 한국
    // UTC+0 --> 영국 시각
    // UTC-5 / UTC+9 --> UTC+0
    // 미국 7월 17일 PM 12:00, 한국 7월 18일 AM 02:00
    // 7월 17일 12:00 --> 17:00,  7월 18일 02:00 --> 7월 17일 17:00

    // DB
    // timezone --> KST / EST (미국 동부시각)
    // order_time --> 12:00, 02:00 --> 7월 17일 17:00
}
