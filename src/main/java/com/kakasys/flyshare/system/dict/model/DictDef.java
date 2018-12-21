package com.kakasys.flyshare.system.dict.model;

import com.kakasys.rootbase.model.BaseModel;

import java.util.Date;
import java.util.List;

/**
 * <p>标题： 字典定义</p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/19 22:04</p>
 * <p>类全名：com.kakasys.flyshare.system.dict.model.DictDef</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class DictDef extends BaseModel
{
    //ID
    private String id;
    //定义编号
    private String dictcode;
    //定义名称
    private String dictdesc;
    //备注
    private String remark;
    //归属系统
    private String sysid;
    //是否启用
    private Boolean inuse = true;
    //制单时间
    private Date predate;
    //修改时间
    private Date modifydate;

    //字典信息
    private List<DictInfo> dictInfos;

    public DictDef()
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

    public String getDictcode()
    {
        return dictcode;
    }

    public void setDictcode(String dictcode)
    {
        this.dictcode = dictcode;
    }

    public String getDictdesc()
    {
        return dictdesc;
    }

    public void setDictdesc(String dictdesc)
    {
        this.dictdesc = dictdesc;
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

    public List<DictInfo> getDictInfos()
    {
        return dictInfos;
    }

    public void setDictInfos(List<DictInfo> dictInfos)
    {
        this.dictInfos = dictInfos;
    }
}
