package com.kakasys.flyshare.system.user.web;

import com.kakasys.flyshare.base.web.BaseController;
import com.kakasys.flyshare.system.user.model.User;
import com.kakasys.flyshare.system.user.model.UserQueryParams;
import com.kakasys.flyshare.system.user.service.UserService;
import com.kakasys.rootbase.invoke.model.InvokeResult;
import com.kakasys.rootbase.invoke.util.InvokeResultUtils;
import com.kakasys.rootbase.page.model.PageInfo;
import com.kakasys.rootbase.page.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/15 21:21</p>
 * <p>类全名：com.kakasys.flyshare.system.user.web.UserController</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Controller
@CrossOrigin
public class UserController extends BaseController
{
    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @RequestMapping(value = "/user-list")
    @ResponseBody
    public InvokeResult userList(@RequestBody UserQueryParams queryParams)
    {
        int count = userService.count(queryParams);
        List<User> userList = userService.queryList(queryParams);
        PageInfo pageInfo = PageUtils.buildPageInfo(queryParams, count);
        return InvokeResultUtils.buildSuccResult("查询成功", userList, pageInfo);
    }

}
