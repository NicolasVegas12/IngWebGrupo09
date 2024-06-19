package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "ventasapp_trabajador", schema = "test01")
public class VentasappTrabajadorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTrabajador", nullable = false)
    private int idTrabajador;
    @Basic
    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;
    @Basic
    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;
    @Basic
    @Column(name = "direccion", nullable = true, length = 150)
    private String direccion;
    @Basic
    @Column(name = "email", nullable = false, length = 254)
    private String email;
    @Basic
    @Column(name = "telefono", nullable = true, length = 8)
    private String telefono;
    @Basic
    @Column(name = "sexo", nullable = false, length = 1)
    private String sexo;
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
    @Basic
    @Column(name = "user_id", nullable = false)
    private int userId;
    @OneToMany(mappedBy = "ventasappTrabajadorByTrabajadorId")
    private Collection<VentasappNotaalmacenEntity> ventasappNotaalmacensByIdTrabajador;
    @OneToMany(mappedBy = "ventasappTrabajadorByTrabajadorId")
    private Collection<VentasappOrdencompraEntity> ventasappOrdencomprasByIdTrabajador;
    @OneToMany(mappedBy = "ventasappTrabajadorByTrabajadorId")
    private Collection<VentasappPedidoventaEntity> ventasappPedidoventasByIdTrabajador;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private AuthUserEntity authUserByUserId;

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

        VentasappTrabajadorEntity that = (VentasappTrabajadorEntity) o;

        if (idTrabajador != that.idTrabajador) return false;
        if (activo != that.activo) return false;
        if (eliminado != that.eliminado) return false;
        if (userId != that.userId) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
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
        int result = idTrabajador;
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (int) activo;
        result = 31 * result + (int) eliminado;
        result = 31 * result + (usuarioRegistro != null ? usuarioRegistro.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (usuarioEliminacion != null ? usuarioEliminacion.hashCode() : 0);
        result = 31 * result + (fechaEliminacion != null ? fechaEliminacion.hashCode() : 0);
        result = 31 * result + userId;
        return result;
    }

    public Collection<VentasappNotaalmacenEntity> getVentasappNotaalmacensByIdTrabajador() {
        return ventasappNotaalmacensByIdTrabajador;
    }

    public void setVentasappNotaalmacensByIdTrabajador(Collection<VentasappNotaalmacenEntity> ventasappNotaalmacensByIdTrabajador) {
        this.ventasappNotaalmacensByIdTrabajador = ventasappNotaalmacensByIdTrabajador;
    }

    public Collection<VentasappOrdencompraEntity> getVentasappOrdencomprasByIdTrabajador() {
        return ventasappOrdencomprasByIdTrabajador;
    }

    public void setVentasappOrdencomprasByIdTrabajador(Collection<VentasappOrdencompraEntity> ventasappOrdencomprasByIdTrabajador) {
        this.ventasappOrdencomprasByIdTrabajador = ventasappOrdencomprasByIdTrabajador;
    }

    public Collection<VentasappPedidoventaEntity> getVentasappPedidoventasByIdTrabajador() {
        return ventasappPedidoventasByIdTrabajador;
    }

    public void setVentasappPedidoventasByIdTrabajador(Collection<VentasappPedidoventaEntity> ventasappPedidoventasByIdTrabajador) {
        this.ventasappPedidoventasByIdTrabajador = ventasappPedidoventasByIdTrabajador;
    }

    public AuthUserEntity getAuthUserByUserId() {
        return authUserByUserId;
    }

    public void setAuthUserByUserId(AuthUserEntity authUserByUserId) {
        this.authUserByUserId = authUserByUserId;
    }
}
