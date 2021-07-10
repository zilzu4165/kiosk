package me.zilzu.kiosk.menu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MenuMapper menuMapper;

    public MenuService(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public void addMenu(MenuSaveRequest menuSaveRequest) {
        menuMapper.addMenu(menuSaveRequest);
    }

    public Menu getMenu(Long menuId) {
        return menuMapper.getMenu(menuId);
    }
}
