package me.zilzu.kiosk.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public void doOrder(OrderSaveRequest orderSaveRequest) {
        Order order = orderSaveRequest.toOrder();
        orderMapper.doOrder(order);
    }

    public Order getOrder(String orderId) {
        return orderMapper.getOrder(orderId);
    }
}
