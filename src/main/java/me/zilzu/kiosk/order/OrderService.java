package me.zilzu.kiosk.order;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public void doOrder(OrderSaveRequest orderSaveRequest) {
        orderMapper.doOrder(orderSaveRequest);
    }

    public Order getOrder(String orderId) {
        return orderMapper.getOrder(orderId);
    }
}
