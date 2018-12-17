package com.kakasys.flyshare.system.menu.dao;

import com.kakasys.flyshare.system.menu.model.Menu;
import com.kakasys.flyshare.system.menu.model.MenuQueryParams;
import com.kakasys.rootbase.query.dao.BaseMapper;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 17:52</p>
 * <p>类全名：com.kakasys.flyshare.system.menu.dao.MenuMapper</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public interface MenuMapper extends BaseMapper
{
    int save(Menu menu);

    int batchSave(List<Menu> menus);

    List<Menu> queryList(MenuQueryParams queryParams);

    List<Menu> queryChild(String parentid);

    int delete(String id);

    int batchDelete(List<String> ids);
}
