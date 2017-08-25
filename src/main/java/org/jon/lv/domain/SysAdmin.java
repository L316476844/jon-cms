package org.jon.lv.domain;

import java.util.Date;

/**
 * @Package: org.jon.lv.domain.SysAdmin.java
 * @Description: 管理员; InnoDB free: 3072 kB
 * @Copyright: Copyright (c) 2017
 * All right reserved.
 * Author jon lv
 * @date 2017/08/25 16:19
 * version v1.0.0
 */
public class SysAdmin {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别 0-男 1-女 2-未知
     */
    private Integer gender;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 头像地址
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
     * 获取用户名
     *
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取密码
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取昵称
     *
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取性别 0-男 1-女 2-未知
     *
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别 0-男 1-女 2-未知
     *
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取手机号
     *
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取头像地址
     *
     * @return header
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置头像地址
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
     * @Date 2017/08/25 16:19
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
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", gender=").append(gender);
        sb.append(", mobile=").append(mobile);
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