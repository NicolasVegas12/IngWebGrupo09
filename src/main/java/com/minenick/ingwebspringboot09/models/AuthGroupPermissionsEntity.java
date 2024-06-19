package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

@Entity
@Table(name = "auth_group_permissions", schema = "test01")
public class AuthGroupPermissionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "group_id", nullable = false)
    private int groupId;
    @Basic
    @Column(name = "permission_id", nullable = false)
    private int permissionId;
    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    private AuthGroupEntity authGroupByGroupId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthGroupPermissionsEntity that = (AuthGroupPermissionsEntity) o;

        if (id != that.id) return false;
        if (groupId != that.groupId) return false;
        return permissionId == that.permissionId;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + groupId;
        result = 31 * result + permissionId;
        return result;
    }

    public AuthGroupEntity getAuthGroupByGroupId() {
        return authGroupByGroupId;
    }

    public void setAuthGroupByGroupId(AuthGroupEntity authGroupByGroupId) {
        this.authGroupByGroupId = authGroupByGroupId;
    }
}
