package org.jon.lv.mapper;

import org.apache.ibatis.annotations.Param;
import org.jon.lv.domain.SysAdmin;

/**
 * @Package: org.jon.lv.mapper.SysAdminMapper.java
 * @Description: 管理员; InnoDB free: 3072 kB
 * @Company: null
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author jon lv
 * @date 2017/08/25 12:04
 * version v1.0.0
 */
//@Repository
public interface SysAdminMapper {
    /**
     * @Description: 根据主键删除数据库的记录
     * @Title deleteByPrimaryKey
     * @Author jon lv
     * @Date 2017/08/25 12:04
     * @param id
     * @return int
     * @throws []
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @Description: 插入数据库记录
     * @Title insert
     * @Author jon lv
     * @Date 2017/08/25 12:04
     * @param record
     * @return int
     * @throws []
     */
    int insert(SysAdmin record);

    /**
     * @Description: 选择性插入数据库记录
     * @Title insertSelective
     * @Author jon lv
     * @Date 2017/08/25 12:04
     * @param record
     * @return int
     * @throws []
     */
    int insertSelective(SysAdmin record);

    /**
     * @Description: 根据主键获取一条数据库记录
     * @Title selectByPrimaryKey
     * @Author jon lv
     * @Date 2017/08/25 12:04
     * @param id
     * @return org.jon.lv.domain.SysAdmin
     * @throws []
     */
    SysAdmin selectByPrimaryKey(Long id);

    /**
     * @Description: 根据主键来更新对应数据库字段
     * @Title updateByPrimaryKeySelective
     * @Author jon lv
     * @Date 2017/08/25 12:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKeySelective(SysAdmin record);

    /**
     * @Description: 根据主键来更新数据库记录
     * @Title updateByPrimaryKey
     * @Author jon lv
     * @Date 2017/08/25 12:04
     * @param record
     * @return int
     * @throws []
     */
    int updateByPrimaryKey(SysAdmin record);

    /**
     * 根据用户名查询管理员
     * @param userName
     * @return
     */
    SysAdmin findAdminByUserName(@Param("userName")String userName);
}