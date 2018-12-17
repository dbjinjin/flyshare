package com.kakasys.flyshare.system.user.model;

import com.kakasys.rootbase.model.BaseModel;
import com.kakasys.rootbase.query.model.QueryParams;

import java.util.Date;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 17:56</p>
 * <p>类全名：com.kakasys.flyshare.system.user.model.UserQueryParams</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class UserQueryParams extends QueryParams
{
    //主键
    private String id;
    //用户名
    private String username;
    //密码
    private String password;
    //昵称
    private String nickname;
    //身份证号
    private String idno;
    //电话
    private String telephone;
    //电子邮箱
    private String email;
    //是否启用
    private Boolean inuse;
    //创建时间
    private Date predateFrom;
    private Date predateTo;
    //修改时间
    private Date modifydateFrom;
    private Date modifydateTo;

    public UserQueryParams()
    {
    }

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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Boolean getInuse()
    {
        return inuse;
    }

    public void setInuse(Boolean inuse)
    {
        this.inuse = inuse;
    }

    public Date getPredateFrom()
    {
        return predateFrom;
    }

    public void setPredateFrom(Date predateFrom)
    {
        this.predateFrom = predateFrom;
    }

    public Date getPredateTo()
    {
        return predateTo;
    }

    public void setPredateTo(Date predateTo)
    {
        this.predateTo = predateTo;
    }

    public Date getModifydateFrom()
    {
        return modifydateFrom;
    }

    public void setModifydateFrom(Date modifydateFrom)
    {
        this.modifydateFrom = modifydateFrom;
    }

    public Date getModifydateTo()
    {
        return modifydateTo;
    }

    public void setModifydateTo(Date modifydateTo)
    {
        this.modifydateTo = modifydateTo;
    }
}
