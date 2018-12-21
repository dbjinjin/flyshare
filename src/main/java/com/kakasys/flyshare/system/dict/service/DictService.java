package com.kakasys.flyshare.system.dict.service;

import com.kakasys.flyshare.system.dict.model.DictDef;
import com.kakasys.flyshare.system.dict.model.DictInfo;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/20 11:23</p>
 * <p>类全名：com.kakasys.flyshare.system.dict.service.DictService</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public interface DictService
{
    DictDef loadDictInfo(String defcode);
}
