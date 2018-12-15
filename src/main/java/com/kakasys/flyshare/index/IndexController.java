package com.kakasys.flyshare.index;

import com.kakasys.flyshare.base.web.BaseController;
import com.kakasys.flyshare.common.FlyshareConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/14 11:14</p>
 * <p>类全名：com.kakasys.flyshare.index.IndexController</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Controller
public class IndexController extends BaseController
{
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexView()
    {
        return FlyshareConstant.PAGE_LOGIN;
    }

}
