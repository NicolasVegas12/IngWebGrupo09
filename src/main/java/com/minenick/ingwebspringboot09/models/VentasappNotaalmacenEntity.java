package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "ventasapp_notaalmacen", schema = "test01")
public class VentasappNotaalmacenEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idNotaAlmacen", nullable = false)
    private int idNotaAlmacen;
    @Basic
    @Column(name = "codigo", nullable = false, length = 10)
    private String codigo;
    @Basic
    @Column(name = "fechaEmision", nullable = false)
    private Date fechaEmision;
    @Basic
    @Column(name = "fechaEntrega", nullable = false)
    private Date fechaEntrega;
    @Basic
    @Column(name = "tipoOperacion", nullable = false, length = 10)
    private String tipoOperacion;
    @Basic
    @Column(name = "serie", nullable = false, length = 20)
    private String serie;
    @Basic
    @Column(name = "numero", nullable = false, length = 20)
    private String numero;
    @Basic
    @Column(name = "estado", nullable = false)
    private int estado;
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
    @Column(name = "trabajador_id", nullable = false)
    private int trabajadorId;
    @Basic
    @Column(name = "ordenCompra_id", nullable = true)
    private Integer ordenCompraId;
    @Basic
    @Column(name = "pedidoVenta_id", nullable = true)
    private Integer pedidoVentaId;
    @OneToMany(mappedBy = "ventasappNotaalmacenByNotaAlmacenId")
    private Collection<VentasappDetallenotaalmacenEntity> ventasappDetallenotaalmacensByIdNotaAlmacen;

    public int getIdNotaAlmacen() {
        return idNotaAlmacen;
    }

    public void setIdNotaAlmacen(int idNotaAlmacen) {
        this.idNotaAlmacen = idNotaAlmacen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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

    public int getTrabajadorId() {
        return trabajadorId;
    }

    public void setTrabajadorId(int trabajadorId) {
        this.trabajadorId = trabajadorId;
    }

    public Integer getOrdenCompraId() {
        return ordenCompraId;
    }

    public void setOrdenCompraId(Integer ordenCompraId) {
        this.ordenCompraId = ordenCompraId;
    }

    public Integer getPedidoVentaId() {
        return pedidoVentaId;
    }

    public void setPedidoVentaId(Integer pedidoVentaId) {
        this.pedidoVentaId = pedidoVentaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VentasappNotaalmacenEntity that = (VentasappNotaalmacenEntity) o;

        if (idNotaAlmacen != that.idNotaAlmacen) return false;
        if (estado != that.estado) return false;
        if (eliminado != that.eliminado) return false;
        if (trabajadorId != that.trabajadorId) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (fechaEmision != null ? !fechaEmision.equals(that.fechaEmision) : that.fechaEmision != null) return false;
        if (fechaEntrega != null ? !fechaEntrega.equals(that.fechaEntrega) : that.fechaEntrega != null) return false;
        if (tipoOperacion != null ? !tipoOperacion.equals(that.tipoOperacion) : that.tipoOperacion != null)
            return false;
        if (serie != null ? !serie.equals(that.serie) : that.serie != null) return false;
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) return false;
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
        if (ordenCompraId != null ? !ordenCompraId.equals(that.ordenCompraId) : that.ordenCompraId != null)
            return false;
        if (pedidoVentaId != null ? !pedidoVentaId.equals(that.pedidoVentaId) : that.pedidoVentaId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idNotaAlmacen;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (fechaEmision != null ? fechaEmision.hashCode() : 0);
        result = 31 * result + (fechaEntrega != null ? fechaEntrega.hashCode() : 0);
        result = 31 * result + (tipoOperacion != null ? tipoOperacion.hashCode() : 0);
        result = 31 * result + (serie != null ? serie.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + estado;
        result = 31 * result + (int) eliminado;
        result = 31 * result + (usuarioRegistro != null ? usuarioRegistro.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (usuarioEliminacion != null ? usuarioEliminacion.hashCode() : 0);
        result = 31 * result + (fechaEliminacion != null ? fechaEliminacion.hashCode() : 0);
        result = 31 * result + trabajadorId;
        result = 31 * result + (ordenCompraId != null ? ordenCompraId.hashCode() : 0);
        result = 31 * result + (pedidoVentaId != null ? pedidoVentaId.hashCode() : 0);
        return result;
    }

    public Collection<VentasappDetallenotaalmacenEntity> getVentasappDetallenotaalmacensByIdNotaAlmacen() {
        return ventasappDetallenotaalmacensByIdNotaAlmacen;
    }

    public void setVentasappDetallenotaalmacensByIdNotaAlmacen(Collection<VentasappDetallenotaalmacenEntity> ventasappDetallenotaalmacensByIdNotaAlmacen) {
        this.ventasappDetallenotaalmacensByIdNotaAlmacen = ventasappDetallenotaalmacensByIdNotaAlmacen;
    }
}
