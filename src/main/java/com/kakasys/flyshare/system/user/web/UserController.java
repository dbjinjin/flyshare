package com.kakasys.flyshare.system.user.web;

import com.kakasys.flyshare.base.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
public class UserController extends BaseController
{
    @RequestMapping(value = "/login-succ.html")
    public ModelAndView loginPage()
    {
        ModelAndView loginSuccPage = new ModelAndView();
        loginSuccPage.setViewName("/main/index");
        return loginSuccPage;
    }
}
