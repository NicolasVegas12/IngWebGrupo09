package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "django_admin_log", schema = "test01")
public class DjangoAdminLogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "action_time", nullable = false)
    private Timestamp actionTime;
    @Basic
    @Column(name = "object_id", nullable = true, length = -1)
    private String objectId;
    @Basic
    @Column(name = "object_repr", nullable = false, length = 200)
    private String objectRepr;
    @Basic
    @Column(name = "action_flag", nullable = false)
    private short actionFlag;
    @Basic
    @Column(name = "change_message", nullable = false, length = -1)
    private String changeMessage;
    @Basic
    @Column(name = "content_type_id", nullable = true)
    private Integer contentTypeId;
    @Basic
    @Column(name = "user_id", nullable = false)
    private int userId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private AuthUserEntity authUserByUserId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getActionTime() {
        return actionTime;
    }

    public void setActionTime(Timestamp actionTime) {
        this.actionTime = actionTime;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectRepr() {
        return objectRepr;
    }

    public void setObjectRepr(String objectRepr) {
        this.objectRepr = objectRepr;
    }

    public short getActionFlag() {
        return actionFlag;
    }

    public void setActionFlag(short actionFlag) {
        this.actionFlag = actionFlag;
    }

    public String getChangeMessage() {
        return changeMessage;
    }

    public void setChangeMessage(String changeMessage) {
        this.changeMessage = changeMessage;
    }

    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DjangoAdminLogEntity that = (DjangoAdminLogEntity) o;

        if (id != that.id) return false;
        if (actionFlag != that.actionFlag) return false;
        if (userId != that.userId) return false;
        if (actionTime != null ? !actionTime.equals(that.actionTime) : that.actionTime != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (objectRepr != null ? !objectRepr.equals(that.objectRepr) : that.objectRepr != null) return false;
        if (changeMessage != null ? !changeMessage.equals(that.changeMessage) : that.changeMessage != null)
            return false;
        if (contentTypeId != null ? !contentTypeId.equals(that.contentTypeId) : that.contentTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (actionTime != null ? actionTime.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (objectRepr != null ? objectRepr.hashCode() : 0);
        result = 31 * result + (int) actionFlag;
        result = 31 * result + (changeMessage != null ? changeMessage.hashCode() : 0);
        result = 31 * result + (contentTypeId != null ? contentTypeId.hashCode() : 0);
        result = 31 * result + userId;
        return result;
    }

    public AuthUserEntity getAuthUserByUserId() {
        return authUserByUserId;
    }

    public void setAuthUserByUserId(AuthUserEntity authUserByUserId) {
        this.authUserByUserId = authUserByUserId;
    }
}
