package me.zilzu.kiosk.menu;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {

    void addMenu(MenuSaveRequest menuSaveRequest);

    Menu getMenu(Long menuId);
}
