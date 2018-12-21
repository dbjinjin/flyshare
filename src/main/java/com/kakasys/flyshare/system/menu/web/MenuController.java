package com.kakasys.flyshare.system.menu.web;

import com.kakasys.flyshare.base.PageInfo;
import com.kakasys.flyshare.base.web.BaseController;
import com.kakasys.flyshare.system.dict.model.DictDef;
import com.kakasys.flyshare.system.dict.service.DictService;
import com.kakasys.flyshare.system.menu.model.Menu;
import com.kakasys.flyshare.system.menu.model.MenuQueryParams;
import com.kakasys.flyshare.system.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    private final DictService dictService;

    @Autowired
    public MenuController(MenuService menuService, DictService dictService)
    {
        this.menuService = menuService;
        this.dictService = dictService;
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

    @RequestMapping(value = "/menu-edit.html")
    public ModelAndView menuEditPage(@RequestParam String id)
    {
        logger.warn("{}", id);
        Menu menu = menuService.findById(id);
        DictDef dict = dictService.loadDictInfo("00100010");
        ModelAndView view = new ModelAndView();
        view.addObject("menu", menu);
        view.addObject("dict", dict);
        view.setViewName("/main/menu/edit");
        return view;
    }

    @RequestMapping(value = "/menu-add.html")
    public ModelAndView menuAddPage()
    {
        ModelAndView view = new ModelAndView();
        view.setViewName("/main/menu/add");
        return view;
    }
}
