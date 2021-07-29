package me.zilzu.kiosk.ordermenu;

import org.springframework.stereotype.Service;

@Service
public class OrderMenuService {

    private final OrderMenuMapper orderMenuMapper;

    public OrderMenuService(OrderMenuMapper orderMenuMapper) {
        this.orderMenuMapper = orderMenuMapper;
    }

    public void receiveOrder(OrderMenuRequest orderMenuRequest) {
        orderMenuMapper.receiveOrder(orderMenuRequest);
    }

    public OrderMenu getOrderMenu(Long orderMenuId) {
        return orderMenuMapper.getOrderMenu(orderMenuId);
    }
}
