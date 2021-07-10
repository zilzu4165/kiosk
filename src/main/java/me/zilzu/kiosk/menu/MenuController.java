package me.zilzu.kiosk.menu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping(value = "/menu")
    public void addMenu(@RequestBody MenuSaveRequest menuSaveRequest) {
        menuService.addMenu(menuSaveRequest);
        log.info("menuAdd = {}", menuSaveRequest);
    }

    @GetMapping(value = "/menu/{menuId}")
    public Menu getMenu(@PathVariable Long menuId) {
        return menuService.getMenu(menuId);
    }
}
