package com.kakasys.flyshare;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 18:35</p>
 * <p>类全名：com.kakasys.flyshare.BaseTest</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public abstract class BaseTest
{
    protected Logger logger = LogManager.getLogger(getClass());
    protected ObjectMapper mapper = new ObjectMapper();

    @Test
    public abstract void save() throws JsonProcessingException;

    @Test
    public abstract void batchSave();

    @Test
    public abstract void queryList() throws JsonProcessingException;

    @Test
    public abstract void delete();

    @Test
    public abstract void batchDelete();
}
