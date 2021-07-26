package me.zilzu.kiosk.ordermenu;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@Sql(value = "classpath:basic_dml.sql")
@SpringBootTest
class OrderMenuServiceTest {

    @Autowired
    private OrderMenuService orderMenuService;

    @Test
    public void receveiveOrderMenu_기본_테스트() {

        OrderMenuRequest orderMenuRequest = new OrderMenuRequest(1,1,100,1L,1L);

        orderMenuService.receiveOrder(orderMenuRequest);

        OrderMenu orderMenu = orderMenuService.getOrderMenu(1L);
        Assertions.assertThat(orderMenu.getQuantity()).isEqualTo(1);
        Assertions.assertThat(orderMenu.getPrice()).isEqualTo(100);
        Assertions.assertThat(orderMenu.getQuantity()).isEqualTo(1);
        Assertions.assertThat(orderMenu.getQuantity()).isEqualTo(1);


    }

}