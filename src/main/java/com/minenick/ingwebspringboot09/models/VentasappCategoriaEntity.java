package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "ventasapp_categoria", schema = "test01")
public class VentasappCategoriaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCategoria", nullable = false)
    private int idCategoria;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Basic
    @Column(name = "activo", nullable = false)
    private byte activo;
    @Basic
    @Column(name = "eliminado", nullable = false)
    private byte eliminado;
    @Basic
    @Column(name = "usuarioRegistro", nullable = false, length = 300)
    private String usuarioRegistro;
    @Basic
    @Column(name = "fechaRegistro", nullable = false)
    private Date fechaRegistro;
    @Basic
    @Column(name = "usuarioModificacion", nullable = true, length = 300)
    private String usuarioModificacion;
    @Basic
    @Column(name = "fechaModificacion", nullable = true)
    private Date fechaModificacion;
    @Basic
    @Column(name = "usuarioEliminacion", nullable = true, length = 300)
    private String usuarioEliminacion;
    @Basic
    @Column(name = "fechaEliminacion", nullable = true)
    private Date fechaEliminacion;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte getActivo() {
        return activo;
    }

    public void setActivo(byte activo) {
        this.activo = activo;
    }

    public byte getEliminado() {
        return eliminado;
    }

    public void setEliminado(byte eliminado) {
        this.eliminado = eliminado;
    }

    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioEliminacion() {
        return usuarioEliminacion;
    }

    public void setUsuarioEliminacion(String usuarioEliminacion) {
        this.usuarioEliminacion = usuarioEliminacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VentasappCategoriaEntity that = (VentasappCategoriaEntity) o;

        if (idCategoria != that.idCategoria) return false;
        if (activo != that.activo) return false;
        if (eliminado != that.eliminado) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (usuarioRegistro != null ? !usuarioRegistro.equals(that.usuarioRegistro) : that.usuarioRegistro != null)
            return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(that.usuarioModificacion) : that.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(that.fechaModificacion) : that.fechaModificacion != null)
            return false;
        if (usuarioEliminacion != null ? !usuarioEliminacion.equals(that.usuarioEliminacion) : that.usuarioEliminacion != null)
            return false;
        if (fechaEliminacion != null ? !fechaEliminacion.equals(that.fechaEliminacion) : that.fechaEliminacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategoria;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (int) activo;
        result = 31 * result + (int) eliminado;
        result = 31 * result + (usuarioRegistro != null ? usuarioRegistro.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (usuarioEliminacion != null ? usuarioEliminacion.hashCode() : 0);
        result = 31 * result + (fechaEliminacion != null ? fechaEliminacion.hashCode() : 0);
        return result;
    }
}
