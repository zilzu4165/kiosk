package me.zilzu.kiosk.order;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    void doOrder(OrderSaveRequest orderSaveRequest);

    Order getOrder(String orderId);
}
