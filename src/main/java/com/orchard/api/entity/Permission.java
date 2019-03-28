package com.orchard.api.entity;

public class Permission {

    /**
     * 主键ID
     */
    private long permissionId;
    /**
     * 角色名称
     */
    private String permissionName;
    /**
     * 角色的唯一性标识
     */
    private String permissionCode;

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }
}
