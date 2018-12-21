package com.kakasys.flyshare.system.dict.dao;

import com.kakasys.flyshare.system.dict.model.DictInfo;
import com.kakasys.rootbase.query.dao.BaseMapper;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/20 10:21</p>
 * <p>类全名：com.kakasys.flyshare.system.dict.dao.DictInfoMapper</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public interface DictInfoMapper extends BaseMapper
{
    /**
     * 新增字典定义明细
     * @param dictInfo 字典明细
     * @return 入库个数
     */
    int save(DictInfo dictInfo);

    /**
     * 新增字典定义明细（批量）
     * @param dictInfos 字典明细(多个)
     * @return 入库个数
     */
    int batchSave(List<DictInfo> dictInfos);

    /**
     *
     * @param id 字典定义ID
     * @return 字典定义明细信息
     */
    List<DictInfo> queryInfo(String id);
}
