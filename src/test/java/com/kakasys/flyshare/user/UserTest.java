package com.kakasys.flyshare.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kakasys.flyshare.BaseTest;
import com.kakasys.flyshare.system.user.dao.UserMapper;
import com.kakasys.flyshare.system.user.model.User;
import com.kakasys.flyshare.system.user.model.UserQueryParams;
import com.kakasys.rootbase.data.util.DataUtils;
import com.kakasys.rootbase.date.FormatStyle;
import com.kakasys.rootbase.date.util.DateUtils;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/17 14:32</p>
 * <p>类全名：com.kakasys.flyshare.user.UserTest</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public class UserTest extends BaseTest
{
    @Resource
    private UserMapper userMapper;

    @Override
    public void save()
    {
        User user = DataUtils.buildRandomData(User.class);
        Assert.assertEquals(1, userMapper.save(user));
    }

    @Override
    public void batchSave()
    {
        List<User> users = DataUtils.buildRandomListData(User.class, 100);
        Assert.assertEquals(users.size(), userMapper.batchSave(users));
    }

    @Override
    public void queryList()
    {
        User user = DataUtils.buildRandomData(User.class);
        userMapper.save(user);
        UserQueryParams queryParams = new UserQueryParams();
        queryParams.setPredateFrom(DateUtils.getStrDate("2018-12-17 13:00:00", FormatStyle.STYLE_TIME));
        Assert.assertTrue(userMapper.queryList(queryParams).size() > 0);
    }

    @Override
    public void delete()
    {
        User user = DataUtils.buildRandomData(User.class);
        userMapper.save(user);
        Assert.assertEquals(1, userMapper.delete(user.getId()));
    }

    @Override
    public void batchDelete()
    {
        UserQueryParams queryParams = new UserQueryParams();
        queryParams.setPredateFrom(DateUtils.getStrDate("2018-12-17 13:00:00", FormatStyle.STYLE_TIME));
        List<User> users = userMapper.queryList(queryParams);
        List<String> ids = users.stream().map(User::getId).collect(Collectors.toList());
        if (!ids.isEmpty())
        {
            Assert.assertEquals(ids.size(), userMapper.batchDelete(ids));
        }

    }
}
