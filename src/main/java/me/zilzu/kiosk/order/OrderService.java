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
        // Controller, Service --> OrderSaveRequest
        // Repository --> Order
        Order order = orderSaveRequest.toOrder();
        orderMapper.doOrder(order);
    }


    // 2021-07-17T10:00:00
    public Order getOrder(String orderId) {
        Order order = orderMapper.getOrder(orderId);

        // 오늘 주문한 건 이면, 에러 로그를 남긴다.
//        LocalDate orderDate = order.getOrderTime().toLocalDate();
//        if (orderDate.isEqual(LocalDate.now())) {
//            log.error("아 오늘 주문한 건인데 왜 조회하니?");
//        }

        return order;
    }
}
