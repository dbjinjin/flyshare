package com.kakasys.flyshare.system.menu.service;

import com.kakasys.flyshare.system.menu.model.Menu;
import com.kakasys.flyshare.system.menu.model.MenuQueryParams;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/17 16:45</p>
 * <p>类全名：com.kakasys.flyshare.system.menu.service.MenuService</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public interface MenuService
{
    List<Menu> queryList(MenuQueryParams queryParams);

    int count(MenuQueryParams queryParams);

    Menu findById(String id);
}
