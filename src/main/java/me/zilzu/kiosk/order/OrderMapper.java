package me.zilzu.kiosk.order;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    void doOrder(Order order);

    Order getOrder(String orderId);
}
