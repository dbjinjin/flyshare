package com.kakasys.flyshare.system.menu.service.impl;

import com.kakasys.flyshare.system.menu.dao.MenuMapper;
import com.kakasys.flyshare.system.menu.model.Menu;
import com.kakasys.flyshare.system.menu.model.MenuQueryParams;
import com.kakasys.flyshare.system.menu.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/17 16:47</p>
 * <p>类全名：com.kakasys.flyshare.system.menu.service.impl.MenuServiceImpl</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Service
public class MenuServiceImpl implements MenuService
{
    @Resource
    private MenuMapper menuMapper;


    @Override
    public List<Menu> queryList(MenuQueryParams queryParams)
    {
        if (queryParams == null)
        {
            queryParams = new MenuQueryParams();
        }
        Integer pageNumber = queryParams.getPageNumber();
        Integer pageSize = queryParams.getPageSize();
        if (pageNumber != null && pageSize != null)
        {
            queryParams.setPageIndex((pageNumber - 1) * pageSize);
        }
        queryParams.setInuse(true);
        return menuMapper.queryList(queryParams);
    }

    @Override
    public int count(MenuQueryParams queryParams)
    {
        queryParams.setInuse(true);
        return menuMapper.count(queryParams);
    }
}
