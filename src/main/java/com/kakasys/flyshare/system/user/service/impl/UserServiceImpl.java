package com.kakasys.flyshare.system.user.service.impl;

import com.kakasys.flyshare.system.menu.dao.MenuMapper;
import com.kakasys.flyshare.system.user.dao.UserMapper;
import com.kakasys.flyshare.system.user.model.User;
import com.kakasys.flyshare.system.user.model.UserQueryParams;
import com.kakasys.flyshare.system.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/31 19:50</p>
 * <p>类全名：com.kakasys.flyshare.system.user.service.impl.UserServiceImpl</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService
{
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryList(UserQueryParams queryParams)
    {
        if (queryParams == null)
        {
            queryParams = new UserQueryParams();
        }
        return userMapper.queryList(queryParams);
    }

    @Override
    public int count(UserQueryParams queryParams)
    {
        return userMapper.count(queryParams);
    }

    @Override
    public User loginCheck(String username, String password)
    {
        UserQueryParams queryParams = new UserQueryParams();
        queryParams.setUsername(username);
        queryParams.setPassword(password);
        List<User> userList = userMapper.queryList(queryParams);
        return (userList != null && userList.size() > 0) ? userList.get(0) : null;
    }
}
