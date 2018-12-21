package com.kakasys.flyshare.dict;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kakasys.flyshare.BaseTest;
import com.kakasys.flyshare.system.dict.dao.DictInfoMapper;
import com.kakasys.flyshare.system.dict.dao.DictMapper;
import com.kakasys.flyshare.system.dict.model.DictDef;
import com.kakasys.flyshare.system.dict.model.DictInfo;
import com.kakasys.flyshare.system.dict.model.DictQueryparams;
import com.kakasys.rootbase.date.util.DateUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/20 10:39</p>
 * <p>类全名：com.kakasys.flyshare.dict.DictTest</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class DictTest extends BaseTest
{

    @Resource
    private DictMapper dictMapper;

    @Resource
    private DictInfoMapper infoMapper;

    @Override
    public void save()
    {
        DictDef dictDef = new DictDef();
        dictDef.setDictcode("00100010");
        dictDef.setDictdesc("系统定义");
        dictDef.setInuse(true);
        dictDef.setSysid("00");
        dictDef.setRemark("测试");
        dictDef.setPredate(DateUtils.getServerDate());
        dictMapper.save(dictDef);
        String id = dictDef.getId();

        List<DictInfo> list = new ArrayList<>();
        DictInfo dictInfo = new DictInfo();
        dictInfo.setId(id);
        dictInfo.setCode("00");
        dictInfo.setLangname1("大师底层");
        dictInfo.setLangname2("RootBase");
        dictInfo.setRemark("大师底层");
        dictInfo.setSortidx(0);
        dictInfo.setPredate(DateUtils.getServerDate());

        DictInfo dictInfo1 = new DictInfo();
        dictInfo1.setId(id);
        dictInfo1.setCode("10");
        dictInfo1.setLangname1("内容发布平台");
        dictInfo1.setLangname2("CMS");
        dictInfo1.setRemark("内容发布平台");
        dictInfo1.setSortidx(1);
        dictInfo1.setPredate(DateUtils.getServerDate());

        DictInfo dictInfo2 = new DictInfo();
        dictInfo2.setId(id);
        dictInfo2.setCode("20");
        dictInfo2.setLangname1("数据交互中心");
        dictInfo2.setLangname2("MQ");
        dictInfo2.setRemark("数据交互中心");
        dictInfo2.setSortidx(2);
        dictInfo2.setPredate(DateUtils.getServerDate());

        DictInfo dictInfo3 = new DictInfo();
        dictInfo3.setId(id);
        dictInfo3.setCode("30");
        dictInfo3.setLangname1("监控系统");
        dictInfo3.setLangname2("MQ");
        dictInfo3.setRemark("监控系统");
        dictInfo3.setSortidx(3);
        dictInfo3.setPredate(DateUtils.getServerDate());

        DictInfo dictInfo4 = new DictInfo();
        dictInfo4.setId(id);
        dictInfo4.setCode("90");
        dictInfo4.setLangname1("业务系统");
        dictInfo4.setLangname2("BUSI");
        dictInfo4.setRemark("业务系统");
        dictInfo4.setSortidx(4);
        dictInfo4.setPredate(DateUtils.getServerDate());

        list.add(dictInfo);
        list.add(dictInfo1);
        list.add(dictInfo2);
        list.add(dictInfo3);
        list.add(dictInfo4);
        infoMapper.batchSave(list);

    }

    @Override
    public void batchSave()
    {

    }

    @Override
    public void queryList()
    {
        try
        {
            DictQueryparams queryparams = new DictQueryparams();
            queryparams.setDictcode("00100010");
            queryparams.setInuse(true);
            logger.warn("{}", new ObjectMapper().writeValueAsString(dictMapper.queryList(queryparams)));
        } catch (Exception e)
        {
            logger.error(e);
        }
    }

    @Override
    public void delete()
    {

    }

    @Override
    public void batchDelete()
    {

    }
}
