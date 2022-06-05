package cn.itcast.menu.service;


import cn.itcast.menu.mapper.MenuMapper;
import cn.itcast.menu.pojo.MainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<MainMenu> getMainMenus(){
        return menuMapper.getMainMenus();
    }
}
