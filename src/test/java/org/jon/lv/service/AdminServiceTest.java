package org.jon.lv.service;

import org.jon.lv.JonCmsApplicationTest;
import org.jon.lv.domain.SysAdmin;
import org.jon.lv.mapper.SysAdminMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Package org.jon.lv.service.AdminServiceTest
 * @Description: AdminServiceTest
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/8/25 16:44
 * version V1.0.0
 */
public class AdminServiceTest extends JonCmsApplicationTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void login(){
        adminService.login("admin", "123456");
    }

}
