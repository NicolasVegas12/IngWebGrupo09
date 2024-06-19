package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "ventasapp_detallepedidoventa", schema = "test01")
public class VentasappDetallepedidoventaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idDetallePedidoVenta", nullable = false)
    private int idDetallePedidoVenta;
    @Basic
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Basic
    @Column(name = "precioUnitario", nullable = false, precision = 0)
    private double precioUnitario;
    @Basic
    @Column(name = "descuentoUnitario", nullable = false, precision = 0)
    private double descuentoUnitario;
    @Basic
    @Column(name = "precio", nullable = false, precision = 0)
    private double precio;
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
    @Column(name = "pedidoVenta_id", nullable = false)
    private int pedidoVentaId;
    @Basic
    @Column(name = "producto_id", nullable = false)
    private int productoId;

    public int getIdDetallePedidoVenta() {
        return idDetallePedidoVenta;
    }

    public void setIdDetallePedidoVenta(int idDetallePedidoVenta) {
        this.idDetallePedidoVenta = idDetallePedidoVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getDescuentoUnitario() {
        return descuentoUnitario;
    }

    public void setDescuentoUnitario(double descuentoUnitario) {
        this.descuentoUnitario = descuentoUnitario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    public int getPedidoVentaId() {
        return pedidoVentaId;
    }

    public void setPedidoVentaId(int pedidoVentaId) {
        this.pedidoVentaId = pedidoVentaId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VentasappDetallepedidoventaEntity that = (VentasappDetallepedidoventaEntity) o;

        if (idDetallePedidoVenta != that.idDetallePedidoVenta) return false;
        if (cantidad != that.cantidad) return false;
        if (Double.compare(that.precioUnitario, precioUnitario) != 0) return false;
        if (Double.compare(that.descuentoUnitario, descuentoUnitario) != 0) return false;
        if (Double.compare(that.precio, precio) != 0) return false;
        if (eliminado != that.eliminado) return false;
        if (pedidoVentaId != that.pedidoVentaId) return false;
        if (productoId != that.productoId) return false;
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
        result = idDetallePedidoVenta;
        result = 31 * result + cantidad;
        temp = Double.doubleToLongBits(precioUnitario);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(descuentoUnitario);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) eliminado;
        result = 31 * result + (usuarioRegistro != null ? usuarioRegistro.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (usuarioEliminacion != null ? usuarioEliminacion.hashCode() : 0);
        result = 31 * result + (fechaEliminacion != null ? fechaEliminacion.hashCode() : 0);
        result = 31 * result + pedidoVentaId;
        result = 31 * result + productoId;
        return result;
    }
}
