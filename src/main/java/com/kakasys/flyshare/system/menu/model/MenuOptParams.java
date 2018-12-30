package com.kakasys.flyshare.system.menu.model;

import com.kakasys.rootbase.data.model.OptParams;

import java.util.Date;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/22 22:41</p>
 * <p>类全名：com.kakasys.flyshare.system.menu.model.MenuOptParams</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class MenuOptParams extends OptParams
{
    //主键
    private String id;
    //是否启用
    private Boolean inuse;
    //修改时间
    private Date modifydate;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Boolean getInuse()
    {
        return inuse;
    }

    public void setInuse(Boolean inuse)
    {
        this.inuse = inuse;
    }

    public Date getModifydate()
    {
        return modifydate;
    }

    public void setModifydate(Date modifydate)
    {
        this.modifydate = modifydate;
    }
}
