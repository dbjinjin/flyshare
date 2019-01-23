package com.kakasys.flyshare.system.user.service;

import com.kakasys.flyshare.system.menu.model.MenuQueryParams;
import com.kakasys.flyshare.system.user.model.User;
import com.kakasys.flyshare.system.user.model.UserOptParams;
import com.kakasys.flyshare.system.user.model.UserQueryParams;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/31 19:50</p>
 * <p>类全名：com.kakasys.flyshare.system.user.service.UserService</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public interface UserService
{
    List<User> queryList(UserQueryParams queryParams);

    int count(UserQueryParams queryParams);

    User loginCheck(String username, String password);

    boolean checkExistUsername(String username);

    boolean addUser(UserOptParams optParams);
}
