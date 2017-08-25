package org.jon.lv.service;

import org.jon.lv.domain.SysAdmin;
import org.jon.lv.result.ResultDO;

/**
 * @Package org.jon.lv.service.AdminService
 * @Description: AdminService
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/8/25 16:14
 * version V1.0.0
 */
public interface AdminService {

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    ResultDO<SysAdmin> login(String userName, String password);
}
