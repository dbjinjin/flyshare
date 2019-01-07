package com.kakasys.flyshare.system.login.web;

import com.kakasys.flyshare.base.web.BaseController;
import com.kakasys.flyshare.system.login.model.LoginCheckParams;
import com.kakasys.flyshare.system.user.model.User;
import com.kakasys.flyshare.system.user.service.UserService;
import com.kakasys.rootbase.invoke.model.InvokeResult;
import com.kakasys.rootbase.invoke.util.InvokeResultUtils;
import com.kakasys.rootbase.string.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2019/1/7 11:03</p>
 * <p>类全名：com.kakasys.flyshare.system.login.web.LoginController</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@CrossOrigin
@Controller
public class LoginController extends BaseController
{
    private UserService userService;

    @Autowired
    public LoginController(UserService userService)
    {
        this.userService = userService;
    }

    @RequestMapping(value = "/login-check")
    @ResponseBody
    public InvokeResult userLogin(HttpServletRequest request, @RequestBody LoginCheckParams checkParams)
    {
        String verifyCode = checkParams.getVerifycode().toUpperCase();
        HttpSession session = request.getSession();
        String sessionId = session.getId();
        logger.info("SessionId:{}", sessionId);
        String sessionVerifyCode = StrUtils.obj2str(session.getAttribute("VerifyCode"));
        if (verifyCode.equals(sessionVerifyCode))
        {
            User user = userService.loginCheck(checkParams.getUsername(), checkParams.getPassword());
            if (user == null)
            {
                return InvokeResultUtils.buildFailResult("用户名或者密码错误");
            } else
            {
                session.setAttribute("LOGIN_USER", user);
                return InvokeResultUtils.buildSuccResult("登录成功", user);
            }
        } else
        {
            return InvokeResultUtils.buildFailResult("验证码错误");
        }
    }
}
