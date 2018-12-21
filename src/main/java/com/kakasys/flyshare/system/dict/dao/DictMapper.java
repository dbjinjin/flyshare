package com.kakasys.flyshare.system.dict.dao;

import com.kakasys.flyshare.system.dict.model.DictDef;
import com.kakasys.flyshare.system.dict.model.DictInfo;
import com.kakasys.flyshare.system.dict.model.DictQueryparams;
import com.kakasys.rootbase.query.dao.BaseMapper;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/20 9:54</p>
 * <p>类全名：com.kakasys.flyshare.system.dict.dao.DictMapper</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public interface DictMapper extends BaseMapper
{
    /**
     * 新增字典定义
     * @param dictDef 字典定义
     * @return 入库个数
     */
    int save(DictDef dictDef);

    /**
     * 查询字典定义
     * @param queryparams 查询参数
     * @return 字典定义list
     */
    List<DictDef> queryList(DictQueryparams queryparams);

}
