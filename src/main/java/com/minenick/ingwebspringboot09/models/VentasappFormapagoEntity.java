package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "ventasapp_formapago", schema = "test01")
public class VentasappFormapagoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idFormaPago", nullable = false)
    private int idFormaPago;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Basic
    @Column(name = "nroCuotas", nullable = false)
    private int nroCuotas;
    @Basic
    @Column(name = "frecuencia", nullable = false, length = 50)
    private String frecuencia;
    @Basic
    @Column(name = "interes", nullable = false, precision = 0)
    private double interes;
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

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(int nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
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

        VentasappFormapagoEntity that = (VentasappFormapagoEntity) o;

        if (idFormaPago != that.idFormaPago) return false;
        if (nroCuotas != that.nroCuotas) return false;
        if (Double.compare(that.interes, interes) != 0) return false;
        if (activo != that.activo) return false;
        if (eliminado != that.eliminado) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (frecuencia != null ? !frecuencia.equals(that.frecuencia) : that.frecuencia != null) return false;
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
        int result;
        long temp;
        result = idFormaPago;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + nroCuotas;
        result = 31 * result + (frecuencia != null ? frecuencia.hashCode() : 0);
        temp = Double.doubleToLongBits(interes);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
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
