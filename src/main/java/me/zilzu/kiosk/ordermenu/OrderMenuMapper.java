package me.zilzu.kiosk.ordermenu;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMenuMapper {

    void receiveOrder(OrderMenuRequest orderMenuRequest);

    OrderMenu getOrderMenu(Long orderMenuId);
}
