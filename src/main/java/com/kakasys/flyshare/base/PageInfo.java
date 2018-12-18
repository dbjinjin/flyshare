package com.kakasys.flyshare.base;

import com.kakasys.rootbase.model.BaseModel;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/17 18:14</p>
 * <p>类全名：com.kakasys.flyshare.base.PageInfo</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class PageInfo extends BaseModel
{
    private Object rows;
    private Integer total;

    public PageInfo()
    {
    }

    public Object getRows()
    {
        return rows;
    }

    public void setRows(Object rows)
    {
        this.rows = rows;
    }

    public Integer getTotal()
    {
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }
}
