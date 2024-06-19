package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "django_migrations", schema = "test01")
public class DjangoMigrationsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "app", nullable = false, length = 255)
    private String app;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "applied", nullable = false)
    private Timestamp applied;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getApplied() {
        return applied;
    }

    public void setApplied(Timestamp applied) {
        this.applied = applied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DjangoMigrationsEntity that = (DjangoMigrationsEntity) o;

        if (id != that.id) return false;
        if (app != null ? !app.equals(that.app) : that.app != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (applied != null ? !applied.equals(that.applied) : that.applied != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (app != null ? app.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (applied != null ? applied.hashCode() : 0);
        return result;
    }
}
