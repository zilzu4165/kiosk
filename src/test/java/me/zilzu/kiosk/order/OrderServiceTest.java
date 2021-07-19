package me.zilzu.kiosk.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;


@Sql(value = {"classpath:basic_dml.sql"})
@SpringBootTest
class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void doOrder_기본_테스트() {
        // Order table에 넣는 과정
        OrderSaveRequest orderSaveRequest = new OrderSaveRequest(1L,100,true,"CARD",1L,1L);

        orderService.doOrder(orderSaveRequest);

        // Order table에서 꺼내오는 과정
        Order order = orderService.getOrder("1");

        assertThat(order.getOrderId()).isEqualTo(1L);
        assertThat(order.getTotalPrice()).isEqualTo(100);
        assertThat(order.getTakeOut()).isEqualTo('Y');
        assertThat(order.getPaymentMethod()).isEqualTo("CARD");
        assertThat(order.getUserId()).isEqualTo(1L);
        assertThat(order.getStoreId()).isEqualTo(1L);
    }
}