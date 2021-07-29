package me.zilzu.kiosk.ordermenu;

import org.springframework.web.bind.annotation.*;

@RestController
public class OrderMenuController {

    private final OrderMenuService orderMenuService;


    public OrderMenuController(OrderMenuService orderMenuService) {
        this.orderMenuService = orderMenuService;
    }

    @PostMapping(value = "/ordermenu")
    public void receivedOrder(@RequestBody OrderMenuRequest orderMenuRequest) {
        orderMenuService.receiveOrder(orderMenuRequest);
    }

    @GetMapping(value = "/ordermenu/{orderMenuId}")
    public OrderMenu getOrderMenu(@PathVariable Long orderMenuId){
        return orderMenuService.getOrderMenu(orderMenuId);
    }
}
