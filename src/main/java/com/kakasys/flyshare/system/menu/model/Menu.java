package com.kakasys.flyshare.system.menu.model;

import com.kakasys.rootbase.model.BaseModel;

import java.util.Date;
import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 17:49</p>
 * <p>类全名：com.kakasys.flyshare.system.menu.model.Menu</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class Menu extends BaseModel
{
    //主键
    private String id;
    //菜单名称
    private String menuname;
    //菜单链接
    private String menuurl;
    //菜单样式
    private String menustyle;
    //父级菜单ID
    private String parentid;
    //归属系统
    private String sysid;
    //是否启用
    private Boolean inuse;
    //序号
    private Integer ordno;
    //制单时间
    private Date predate;
    //修改时间
    private Date modifydate;

    //子菜单
    private List<Menu> childMenus;

    public Menu()
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

    public String getMenuname()
    {
        return menuname;
    }

    public void setMenuname(String menuname)
    {
        this.menuname = menuname;
    }

    public String getMenuurl()
    {
        return menuurl;
    }

    public void setMenuurl(String menuurl)
    {
        this.menuurl = menuurl;
    }

    public String getMenustyle()
    {
        return menustyle;
    }

    public void setMenustyle(String menustyle)
    {
        this.menustyle = menustyle;
    }

    public String getParentid()
    {
        return parentid;
    }

    public void setParentid(String parentid)
    {
        this.parentid = parentid;
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

    public Integer getOrdno()
    {
        return ordno;
    }

    public void setOrdno(Integer ordno)
    {
        this.ordno = ordno;
    }

    public Date getPredate()
    {
        return predate;
    }

    public void setPredate(Date predate)
    {
        this.predate = predate;
    }

    public Date getModifydate()
    {
        return modifydate;
    }

    public void setModifydate(Date modifydate)
    {
        this.modifydate = modifydate;
    }

    public List<Menu> getChildMenus()
    {
        return childMenus;
    }

    public void setChildMenus(List<Menu> childMenus)
    {
        this.childMenus = childMenus;
    }
}
