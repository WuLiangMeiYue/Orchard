package com.orchard.api.entity;

public class Role {

    /**
     * 主键ID
     */
    private long roleId;

    /**
     * 权限名称
     */
    private String roleName;

    /**
     * 权限唯一性标识
     */
    private String roleCode;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}
