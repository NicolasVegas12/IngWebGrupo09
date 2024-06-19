package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "auth_permission", schema = "test01")
public class AuthPermissionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "content_type_id", nullable = false)
    private int contentTypeId;
    @Basic
    @Column(name = "codename", nullable = false, length = 100)
    private String codename;
    @OneToMany(mappedBy = "authPermissionByPermissionId")
    private Collection<AuthGroupPermissionsEntity> authGroupPermissionsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(int contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthPermissionEntity that = (AuthPermissionEntity) o;

        if (id != that.id) return false;
        if (contentTypeId != that.contentTypeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (codename != null ? !codename.equals(that.codename) : that.codename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + contentTypeId;
        result = 31 * result + (codename != null ? codename.hashCode() : 0);
        return result;
    }

    public Collection<AuthGroupPermissionsEntity> getAuthGroupPermissionsById() {
        return authGroupPermissionsById;
    }

    public void setAuthGroupPermissionsById(Collection<AuthGroupPermissionsEntity> authGroupPermissionsById) {
        this.authGroupPermissionsById = authGroupPermissionsById;
    }
}
