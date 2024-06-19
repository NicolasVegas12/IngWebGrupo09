package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

@Entity
@Table(name = "auth_user_groups", schema = "test01")
public class AuthUserGroupsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Basic
    @Column(name = "group_id", nullable = false)
    private int groupId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private AuthUserEntity authUserByUserId;
    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    private AuthGroupEntity authGroupByGroupId;

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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthUserGroupsEntity that = (AuthUserGroupsEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (groupId != that.groupId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + userId;
        result = 31 * result + groupId;
        return result;
    }

    public AuthUserEntity getAuthUserByUserId() {
        return authUserByUserId;
    }

    public void setAuthUserByUserId(AuthUserEntity authUserByUserId) {
        this.authUserByUserId = authUserByUserId;
    }

    public AuthGroupEntity getAuthGroupByGroupId() {
        return authGroupByGroupId;
    }

    public void setAuthGroupByGroupId(AuthGroupEntity authGroupByGroupId) {
        this.authGroupByGroupId = authGroupByGroupId;
    }
}
