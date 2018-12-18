package com.kakasys.flyshare.system.menu.web;

import com.kakasys.flyshare.base.PageInfo;
import com.kakasys.flyshare.base.web.BaseController;
import com.kakasys.flyshare.system.menu.dao.MenuMapper;
import com.kakasys.flyshare.system.menu.model.Menu;
import com.kakasys.flyshare.system.menu.model.MenuQueryParams;
import com.kakasys.flyshare.system.menu.service.MenuService;
import com.kakasys.rootbase.date.FormatStyle;
import com.kakasys.rootbase.date.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 17:54</p>
 * <p>类全名：com.kakasys.flyshare.system.menu.web.MenuController</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Controller
public class MenuController extends BaseController
{

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService)
    {
        this.menuService = menuService;
    }

    @RequestMapping(value = "/menu-list", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo queryList(@RequestBody MenuQueryParams menuQueryParams /*Integer pageNumber, Integer pageSize, String sortName, String sortOrder*/)
    {
        PageInfo info = new PageInfo();
        int count = menuService.count(menuQueryParams);
        List<Menu> list = menuService.queryList(menuQueryParams);
        info.setTotal(count);
        info.setRows(list);
        return info;
    }
}
