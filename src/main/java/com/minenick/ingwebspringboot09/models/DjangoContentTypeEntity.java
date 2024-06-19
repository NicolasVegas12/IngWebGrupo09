package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "django_content_type", schema = "test01")
public class DjangoContentTypeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "app_label", nullable = false, length = 100)
    private String appLabel;
    @Basic
    @Column(name = "model", nullable = false, length = 100)
    private String model;
    @OneToMany(mappedBy = "djangoContentTypeByContentTypeId")
    private Collection<AuthPermissionEntity> authPermissionsById;
    @OneToMany(mappedBy = "djangoContentTypeByContentTypeId")
    private Collection<DjangoAdminLogEntity> djangoAdminLogsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DjangoContentTypeEntity that = (DjangoContentTypeEntity) o;

        if (id != that.id) return false;
        if (appLabel != null ? !appLabel.equals(that.appLabel) : that.appLabel != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (appLabel != null ? appLabel.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    public Collection<AuthPermissionEntity> getAuthPermissionsById() {
        return authPermissionsById;
    }

    public void setAuthPermissionsById(Collection<AuthPermissionEntity> authPermissionsById) {
        this.authPermissionsById = authPermissionsById;
    }

    public Collection<DjangoAdminLogEntity> getDjangoAdminLogsById() {
        return djangoAdminLogsById;
    }

    public void setDjangoAdminLogsById(Collection<DjangoAdminLogEntity> djangoAdminLogsById) {
        this.djangoAdminLogsById = djangoAdminLogsById;
    }
}
