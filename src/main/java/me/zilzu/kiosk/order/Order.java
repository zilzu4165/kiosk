package me.zilzu.kiosk.order;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class Order {
    private final Long orderId;
    private final Integer totalPrice;
    private final LocalDateTime orderTime; // timestamp --> LocalDateTime, timestamp --> LocalDateTime --> String
    private final char takeOut;
    private final String paymentMethod;
    private final Long userId;
    private final Long storeId;
}
