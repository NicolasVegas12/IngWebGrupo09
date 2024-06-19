package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

@Entity
@Table(name = "auth_user_user_permissions", schema = "test01")
public class AuthUserUserPermissionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Basic
    @Column(name = "permission_id", nullable = false)
    private int permissionId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private AuthUserEntity authUserByUserId;
    @ManyToOne
    @JoinColumn(name = "permission_id", referencedColumnName = "id", nullable = false)
    private AuthPermissionEntity authPermissionByPermissionId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

        AuthUserUserPermissionsEntity that = (AuthUserUserPermissionsEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (permissionId != that.permissionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + userId;
        result = 31 * result + permissionId;
        return result;
    }

    public AuthUserEntity getAuthUserByUserId() {
        return authUserByUserId;
    }

    public void setAuthUserByUserId(AuthUserEntity authUserByUserId) {
        this.authUserByUserId = authUserByUserId;
    }

    public AuthPermissionEntity getAuthPermissionByPermissionId() {
        return authPermissionByPermissionId;
    }

    public void setAuthPermissionByPermissionId(AuthPermissionEntity authPermissionByPermissionId) {
        this.authPermissionByPermissionId = authPermissionByPermissionId;
    }
}
