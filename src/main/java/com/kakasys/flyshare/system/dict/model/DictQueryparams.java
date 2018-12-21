package com.kakasys.flyshare.system.dict.model;

import com.kakasys.rootbase.query.model.QueryParams;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/20 10:07</p>
 * <p>类全名：com.kakasys.flyshare.system.dict.model.DictQueryparams</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class DictQueryparams extends QueryParams
{
    //定义编号
    private String dictcode;

    //是否启用
    private  Boolean inuse;

    public String getDictcode()
    {
        return dictcode;
    }

    public void setDictcode(String dictcode)
    {
        this.dictcode = dictcode;
    }

    public Boolean getInuse()
    {
        return inuse;
    }

    public void setInuse(Boolean inuse)
    {
        this.inuse = inuse;
    }
}
