package com.kakasys.flyshare.menu;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kakasys.flyshare.BaseTest;
import com.kakasys.flyshare.system.menu.dao.MenuMapper;
import com.kakasys.flyshare.system.menu.model.Menu;
import com.kakasys.flyshare.system.menu.model.MenuQueryParams;
import com.kakasys.rootbase.data.util.DataUtils;
import com.kakasys.rootbase.date.FormatStyle;
import com.kakasys.rootbase.date.util.DateUtils;
import com.kakasys.rootbase.string.StrUtils;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 18:26</p>
 * <p>类全名：com.kakasys.flyshare.menu.MenuTest</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuTest extends BaseTest
{
    @Resource
    private MenuMapper menuMapper;


    private List<String> list = new ArrayList<>();

    @Override
    public void save()
    {
        Menu menu = DataUtils.buildRandomData(Menu.class);
        int saveCount = menuMapper.save(menu);
        Assert.assertEquals(1, saveCount);
    }

    @Override
    public void batchSave()
    {
        List<Menu> menus = new ArrayList<>();
        int size = 1000;
        for (int i = 0; i < size; i++)
        {
            Menu menu = DataUtils.buildRandomData(Menu.class);
            menu.setId(null);
            menus.add(menu);
        }
        long time1 = System.currentTimeMillis();
        Assert.assertEquals(size, menuMapper.batchSave(menus));
        long time2 = System.currentTimeMillis();
        logger.warn("入库数据:{} 费时:{}", size, time2 - time1);
    }

    @Override
    public void queryList()
    {
        MenuQueryParams menuQueryParams = new MenuQueryParams();
        menuQueryParams.setSysid("00");
        List<Menu> list = menuMapper.queryList(menuQueryParams);
        Assert.assertTrue(list.size() > 0);
    }

    @Override
    public void delete()
    {
        Menu menu = DataUtils.buildRandomData(Menu.class);
        menuMapper.save(menu);
        String id = menu.getId();
        logger.info("新增数据:{}", id);
        if (StrUtils.isNotNull(id))
        {
            Assert.assertEquals(1, menuMapper.delete(id));
        }
    }

    @Override
    public void batchDelete()
    {
        MenuQueryParams menuQueryParams = new MenuQueryParams();
        menuQueryParams.setPredateFrom(DateUtils.getStrDate("2018-12-17 10:00:00", FormatStyle.STYLE_TIME));
        long time1 = System.currentTimeMillis();
        List<Menu> list = menuMapper.queryList(menuQueryParams);
        long time2 = System.currentTimeMillis();
        logger.warn("查询数量：{} 费时:{}", list.size(), (double) (time2 - time1) / 1000);
        if (!list.isEmpty())
        {
            List<String> ids = new ArrayList<>();
            for (Menu menu : list)
            {
                ids.add(menu.getId());
            }
            Assert.assertEquals(list.size(), menuMapper.batchDelete(ids));
        }
    }

}
