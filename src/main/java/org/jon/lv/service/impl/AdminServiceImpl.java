package org.jon.lv.service.impl;

import org.jon.lv.domain.SysAdmin;
import org.jon.lv.mapper.SysAdminMapper;
import org.jon.lv.result.ResultDO;
import org.jon.lv.service.AdminService;
import org.jon.lv.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package org.jon.lv.service.impl.AdminServiceImpl
 * @Description: AdminService
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/8/25 16:14
 * version V1.0.0
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private SysAdminMapper sysAdminMapper;

    @Override
    public ResultDO<SysAdmin> login(String userName, String password) {

        ResultDO<SysAdmin> resultDO = new ResultDO<>();

        SysAdmin admin = sysAdminMapper.findAdminByUserName(userName);

        if(admin == null){
            resultDO.setErrMsg("用户名不存在!");
            return resultDO;
        }
        if(!admin.getPassword().equals(MD5Utils.encrypt(password))){
            resultDO.setErrMsg("密码错误!");
            return resultDO;
        }
        resultDO.setData(admin);
        resultDO.setSuccess(true);

        return resultDO;
    }
}
