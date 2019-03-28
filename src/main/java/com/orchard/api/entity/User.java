package com.orchard.api.entity;

import java.util.Objects;

public class User {
    /**
     * 主键ID
     */
    private long useId;
    /**
     * 账号
     */
    private String userName;
    /**
     * 密码
     */
    private String userPassword;
    /**
     * 对应角色的唯一性标识
     */
    private String userCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return useId == user.useId &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userPassword, user.userPassword) &&
                Objects.equals(userCode, user.userCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useId, userName, userPassword, userCode);
    }

    public long getUseId() {
        return useId;
    }

    public void setUseId(long useId) {
        this.useId = useId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
