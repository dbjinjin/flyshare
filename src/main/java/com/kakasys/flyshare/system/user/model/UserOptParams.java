package com.kakasys.flyshare.system.user.model;

import com.kakasys.rootbase.data.model.OptParams;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2019/1/16 11:13</p>
 * <p>类全名：com.kakasys.flyshare.system.user.model.UserOptParams</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class UserOptParams extends OptParams
{
    //主键
    private String id;
    //用户名
    private String username;
    //密码
    private String password;
    //昵称
    private String nickname;
    //性别
    private String gender;
    //出生日期
    private String birthday;
    //身份证号
    private String idno;
    //电话
    private String telephone;
    //联系地址
    private String address;
    //电子邮箱
    private String email;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
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

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public String getIdno()
    {
        return idno;
    }

    public void setIdno(String idno)
    {
        this.idno = idno;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
