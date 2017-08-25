package org.jon.lv.domain;

import java.util.Date;

/**
 * @Package: org.jon.lv.domain.SysAdmin.java
 * @Description: 管理员; InnoDB free: 3072 kB
 * @Company: null
 * @Copyright: Copyright (c) 2017 
 * All right reserved.
 * Author jon lv
 * @date 2017/08/25 12:04
 * version v1.0.0
 */
public class SysAdmin {
    /**
     * 主键
     */
    private Long id;

    /**
     * mobile
     */
    private String mobile;

    /**
     * password
     */
    private String password;

    /**
     * header
     */
    private String header;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 最后修改时间
     */
    private Date modifyTime;

    /**
     * 修改人
     */
    private Long modifier;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 获取主键
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取mobile
     *
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取header
     *
     * @return header
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置header
     *
     * @param header
     */
    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return creator
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 获取最后修改时间
     *
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取修改人
     *
     * @return modifier
     */
    public Long getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier
     */
    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取版本号
     *
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * @Title toString
     * @Author jon lv
     * @Date 2017/08/25 12:04
     * @return java.lang.String
     * @throws []
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", header=").append(header);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", version=").append(version);
        sb.append("]");
        return sb.toString();
    }
}