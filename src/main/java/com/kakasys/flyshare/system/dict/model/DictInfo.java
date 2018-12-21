package com.kakasys.flyshare.system.dict.model;

import com.kakasys.rootbase.model.BaseModel;

import java.util.Date;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/20 9:43</p>
 * <p>类全名：com.kakasys.flyshare.system.dict.model.DictInfo</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class DictInfo extends BaseModel
{
    //字典定义ID
    private String id;
    //编号
    private String code;
    //中文名称
    private String langname1;
    //英文名称
    private String langname2;
    //备注
    private String remark;
    //排序索引
    private Integer sortidx;
    //是否启用
    private Boolean inuse = true;
    //制单时间
    private Date predate;
    //修改时间
    private Date modifydate;

    public DictInfo()
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

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getLangname1()
    {
        return langname1;
    }

    public void setLangname1(String langname1)
    {
        this.langname1 = langname1;
    }

    public String getLangname2()
    {
        return langname2;
    }

    public void setLangname2(String langname2)
    {
        this.langname2 = langname2;
    }

    public Integer getSortidx()
    {
        return sortidx;
    }

    public void setSortidx(Integer sortidx)
    {
        this.sortidx = sortidx;
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

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
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
