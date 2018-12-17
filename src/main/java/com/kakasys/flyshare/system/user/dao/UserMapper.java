package com.kakasys.flyshare.system.user.dao;

import com.kakasys.flyshare.system.user.model.User;
import com.kakasys.flyshare.system.user.model.UserQueryParams;

import java.util.List;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/16 17:54</p>
 * <p>类全名：com.kakasys.flyshare.system.user.dao.UserMapper</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
public interface UserMapper
{
    int save(User user);

    int batchSave(List<User> users);

    List<User> queryList(UserQueryParams queryParams);

    int delete(String id);

    int batchDelete(List<String> ids);
}
