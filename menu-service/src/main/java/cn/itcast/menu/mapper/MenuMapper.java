package cn.itcast.menu.mapper;

import cn.itcast.menu.pojo.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    public List<MainMenu>  getMainMenus();
}
