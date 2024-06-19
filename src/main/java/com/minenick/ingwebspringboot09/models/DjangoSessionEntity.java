package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "django_session", schema = "test01")
public class DjangoSessionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "session_key", nullable = false, length = 40)
    private String sessionKey;
    @Basic
    @Column(name = "session_data", nullable = false, length = -1)
    private String sessionData;
    @Basic
    @Column(name = "expire_date", nullable = false)
    private Timestamp expireDate;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getSessionData() {
        return sessionData;
    }

    public void setSessionData(String sessionData) {
        this.sessionData = sessionData;
    }

    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DjangoSessionEntity that = (DjangoSessionEntity) o;

        if (sessionKey != null ? !sessionKey.equals(that.sessionKey) : that.sessionKey != null) return false;
        if (sessionData != null ? !sessionData.equals(that.sessionData) : that.sessionData != null) return false;
        if (expireDate != null ? !expireDate.equals(that.expireDate) : that.expireDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sessionKey != null ? sessionKey.hashCode() : 0;
        result = 31 * result + (sessionData != null ? sessionData.hashCode() : 0);
        result = 31 * result + (expireDate != null ? expireDate.hashCode() : 0);
        return result;
    }
}
