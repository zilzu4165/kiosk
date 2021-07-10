package me.zilzu.kiosk.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(value = "/order")
    public void doOrder(@RequestBody OrderSaveRequest orderSaveRequest) {
        log.info("order = {}", orderSaveRequest);
        orderService.doOrder(orderSaveRequest);
    }

    @GetMapping(value = "/order/{orderId}")
    public Order getOrder(@PathVariable String orderId) {
        return orderService.getOrder(orderId);
    }
}
