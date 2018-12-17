package com.kakasys.flyshare.system.menu.model;

import com.kakasys.rootbase.query.model.QueryParams;

import java.util.Date;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 17:52</p>
 * <p>类全名：com.kakasys.flyshare.system.menu.model.MenuQueryParams</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class MenuQueryParams extends QueryParams
{
    //主键
    private String id;
    //菜单名称
    private String menuname;
    //归属系统
    private String sysid;
    //父级ID
    private String parentid;
    //是否启用
    private Boolean inuse;
    //制单时间(开始)
    private Date predateFrom;
    //制单时间(结束)
    private Date predateTo;

    public MenuQueryParams()
    {
    }

    public String getMenuname()
    {
        return menuname;
    }

    public void setMenuname(String menuname)
    {
        this.menuname = menuname;
    }

    public String getSysid()
    {
        return sysid;
    }

    public void setSysid(String sysid)
    {
        this.sysid = sysid;
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

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}
