package com.kakasys.flyshare.system.login.model;

import com.kakasys.rootbase.model.BaseModel;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2019/1/7 10:33</p>
 * <p>类全名：com.kakasys.flyshare.system.user.model.LoginCheckParams</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class LoginCheckParams extends BaseModel
{
    //用户名
    private String username;
    //密码
    private String password;
    //验证码
    private String verifycode;

    public LoginCheckParams()
    {
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getVerifycode()
    {
        return verifycode;
    }

    public void setVerifycode(String verifycode)
    {
        this.verifycode = verifycode;
    }
}
