package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "ventasapp_pedidoventa", schema = "test01")
public class VentasappPedidoventaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPedidoVenta", nullable = false)
    private int idPedidoVenta;
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
    @Column(name = "tipoMoneda", nullable = false, length = 50)
    private String tipoMoneda;
    @Basic
    @Column(name = "tasaCambio", nullable = false, precision = 0)
    private double tasaCambio;
    @Basic
    @Column(name = "subtotal", nullable = false, precision = 0)
    private double subtotal;
    @Basic
    @Column(name = "tasaIgv", nullable = false, precision = 0)
    private double tasaIgv;
    @Basic
    @Column(name = "descuento", nullable = false, precision = 0)
    private double descuento;
    @Basic
    @Column(name = "total", nullable = false, precision = 0)
    private double total;
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
    @Column(name = "cliente_id", nullable = false)
    private int clienteId;
    @Basic
    @Column(name = "formaPago_id", nullable = false)
    private int formaPagoId;
    @Basic
    @Column(name = "trabajador_id", nullable = false)
    private int trabajadorId;
    @Basic
    @Column(name = "tipoDocumento", nullable = false, length = 20)
    private String tipoDocumento;
    @OneToMany(mappedBy = "ventasappPedidoventaByPedidoVentaId")
    private Collection<VentasappDetallepedidoventaEntity> ventasappDetallepedidoventasByIdPedidoVenta;
    @OneToMany(mappedBy = "ventasappPedidoventaByPedidoVentaId")
    private Collection<VentasappDocumentoventaEntity> ventasappDocumentoventasByIdPedidoVenta;
    @OneToMany(mappedBy = "ventasappPedidoventaByPedidoVentaId")
    private Collection<VentasappNotaalmacenEntity> ventasappNotaalmacensByIdPedidoVenta;
    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "idCliente", nullable = false)
    private VentasappClienteEntity ventasappClienteByClienteId;
    @ManyToOne
    @JoinColumn(name = "formaPago_id", referencedColumnName = "idFormaPago", nullable = false)
    private VentasappFormapagoEntity ventasappFormapagoByFormaPagoId;

    public int getIdPedidoVenta() {
        return idPedidoVenta;
    }

    public void setIdPedidoVenta(int idPedidoVenta) {
        this.idPedidoVenta = idPedidoVenta;
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

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTasaIgv() {
        return tasaIgv;
    }

    public void setTasaIgv(double tasaIgv) {
        this.tasaIgv = tasaIgv;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getFormaPagoId() {
        return formaPagoId;
    }

    public void setFormaPagoId(int formaPagoId) {
        this.formaPagoId = formaPagoId;
    }

    public int getTrabajadorId() {
        return trabajadorId;
    }

    public void setTrabajadorId(int trabajadorId) {
        this.trabajadorId = trabajadorId;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VentasappPedidoventaEntity that = (VentasappPedidoventaEntity) o;

        if (idPedidoVenta != that.idPedidoVenta) return false;
        if (Double.compare(that.tasaCambio, tasaCambio) != 0) return false;
        if (Double.compare(that.subtotal, subtotal) != 0) return false;
        if (Double.compare(that.tasaIgv, tasaIgv) != 0) return false;
        if (Double.compare(that.descuento, descuento) != 0) return false;
        if (Double.compare(that.total, total) != 0) return false;
        if (estado != that.estado) return false;
        if (eliminado != that.eliminado) return false;
        if (clienteId != that.clienteId) return false;
        if (formaPagoId != that.formaPagoId) return false;
        if (trabajadorId != that.trabajadorId) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (fechaEmision != null ? !fechaEmision.equals(that.fechaEmision) : that.fechaEmision != null) return false;
        if (fechaEntrega != null ? !fechaEntrega.equals(that.fechaEntrega) : that.fechaEntrega != null) return false;
        if (tipoMoneda != null ? !tipoMoneda.equals(that.tipoMoneda) : that.tipoMoneda != null) return false;
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
        if (tipoDocumento != null ? !tipoDocumento.equals(that.tipoDocumento) : that.tipoDocumento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idPedidoVenta;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (fechaEmision != null ? fechaEmision.hashCode() : 0);
        result = 31 * result + (fechaEntrega != null ? fechaEntrega.hashCode() : 0);
        result = 31 * result + (tipoMoneda != null ? tipoMoneda.hashCode() : 0);
        temp = Double.doubleToLongBits(tasaCambio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(subtotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tasaIgv);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(descuento);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(total);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + estado;
        result = 31 * result + (int) eliminado;
        result = 31 * result + (usuarioRegistro != null ? usuarioRegistro.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (usuarioEliminacion != null ? usuarioEliminacion.hashCode() : 0);
        result = 31 * result + (fechaEliminacion != null ? fechaEliminacion.hashCode() : 0);
        result = 31 * result + clienteId;
        result = 31 * result + formaPagoId;
        result = 31 * result + trabajadorId;
        result = 31 * result + (tipoDocumento != null ? tipoDocumento.hashCode() : 0);
        return result;
    }

    public Collection<VentasappDetallepedidoventaEntity> getVentasappDetallepedidoventasByIdPedidoVenta() {
        return ventasappDetallepedidoventasByIdPedidoVenta;
    }

    public void setVentasappDetallepedidoventasByIdPedidoVenta(Collection<VentasappDetallepedidoventaEntity> ventasappDetallepedidoventasByIdPedidoVenta) {
        this.ventasappDetallepedidoventasByIdPedidoVenta = ventasappDetallepedidoventasByIdPedidoVenta;
    }

    public Collection<VentasappDocumentoventaEntity> getVentasappDocumentoventasByIdPedidoVenta() {
        return ventasappDocumentoventasByIdPedidoVenta;
    }

    public void setVentasappDocumentoventasByIdPedidoVenta(Collection<VentasappDocumentoventaEntity> ventasappDocumentoventasByIdPedidoVenta) {
        this.ventasappDocumentoventasByIdPedidoVenta = ventasappDocumentoventasByIdPedidoVenta;
    }

    public Collection<VentasappNotaalmacenEntity> getVentasappNotaalmacensByIdPedidoVenta() {
        return ventasappNotaalmacensByIdPedidoVenta;
    }

    public void setVentasappNotaalmacensByIdPedidoVenta(Collection<VentasappNotaalmacenEntity> ventasappNotaalmacensByIdPedidoVenta) {
        this.ventasappNotaalmacensByIdPedidoVenta = ventasappNotaalmacensByIdPedidoVenta;
    }

    public VentasappClienteEntity getVentasappClienteByClienteId() {
        return ventasappClienteByClienteId;
    }

    public void setVentasappClienteByClienteId(VentasappClienteEntity ventasappClienteByClienteId) {
        this.ventasappClienteByClienteId = ventasappClienteByClienteId;
    }

    public VentasappFormapagoEntity getVentasappFormapagoByFormaPagoId() {
        return ventasappFormapagoByFormaPagoId;
    }

    public void setVentasappFormapagoByFormaPagoId(VentasappFormapagoEntity ventasappFormapagoByFormaPagoId) {
        this.ventasappFormapagoByFormaPagoId = ventasappFormapagoByFormaPagoId;
    }
}
