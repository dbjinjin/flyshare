package com.kakasys.flyshare.system.dict.service.impl;

import com.kakasys.flyshare.system.dict.dao.DictInfoMapper;
import com.kakasys.flyshare.system.dict.dao.DictMapper;
import com.kakasys.flyshare.system.dict.model.DictDef;
import com.kakasys.flyshare.system.dict.model.DictQueryparams;
import com.kakasys.flyshare.system.dict.service.DictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/20 11:23</p>
 * <p>类全名：com.kakasys.flyshare.system.dict.service.impl.DictServiceImpl</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Service
public class DictServiceImpl implements DictService
{
    @Resource
    private DictMapper dictMapper;

    @Resource
    private DictInfoMapper dictInfoMapper;

    @Override
    public DictDef loadDictInfo(String defcode)
    {
        DictQueryparams queryparams = new DictQueryparams();
        queryparams.setDictcode(defcode);
        queryparams.setInuse(true);
        List<DictDef> list = dictMapper.queryList(queryparams);
        return (list != null && list.size() > 0) ? list.get(0) : null;
    }
}
