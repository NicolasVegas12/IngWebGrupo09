package com.minenick.ingwebspringboot09.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "ventasapp_producto", schema = "test01")
public class VentasappProductoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idProducto", nullable = false)
    private int idProducto;
    @Basic
    @Column(name = "codigo", nullable = false, length = 10)
    private String codigo;
    @Basic
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Basic
    @Column(name = "marca", nullable = false, length = 100)
    private String marca;
    @Basic
    @Column(name = "modelo", nullable = false, length = 100)
    private String modelo;
    @Basic
    @Column(name = "stock", nullable = false)
    private int stock;
    @Basic
    @Column(name = "precioUnitario", nullable = false, precision = 0)
    private double precioUnitario;
    @Basic
    @Column(name = "urlImagen", nullable = true, length = 1000)
    private String urlImagen;
    @Basic
    @Column(name = "nombreImagen", nullable = true, length = 1000)
    private String nombreImagen;
    @Basic
    @Column(name = "fechaCargaImagen", nullable = true)
    private Date fechaCargaImagen;
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
    @Column(name = "categoria_id", nullable = false)
    private int categoriaId;
    @OneToMany(mappedBy = "ventasappProductoByProductoId")
    private Collection<VentasappDetallenotaalmacenEntity> ventasappDetallenotaalmacensByIdProducto;
    @OneToMany(mappedBy = "ventasappProductoByProductoId")
    private Collection<VentasappDetalleordencompraEntity> ventasappDetalleordencomprasByIdProducto;
    @OneToMany(mappedBy = "ventasappProductoByProductoId")
    private Collection<VentasappDetallepedidoventaEntity> ventasappDetallepedidoventasByIdProducto;
    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "idCategoria", nullable = false)
    private VentasappCategoriaEntity ventasappCategoriaByCategoriaId;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public Date getFechaCargaImagen() {
        return fechaCargaImagen;
    }

    public void setFechaCargaImagen(Date fechaCargaImagen) {
        this.fechaCargaImagen = fechaCargaImagen;
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

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VentasappProductoEntity that = (VentasappProductoEntity) o;

        if (idProducto != that.idProducto) return false;
        if (stock != that.stock) return false;
        if (Double.compare(that.precioUnitario, precioUnitario) != 0) return false;
        if (activo != that.activo) return false;
        if (eliminado != that.eliminado) return false;
        if (categoriaId != that.categoriaId) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (marca != null ? !marca.equals(that.marca) : that.marca != null) return false;
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) return false;
        if (urlImagen != null ? !urlImagen.equals(that.urlImagen) : that.urlImagen != null) return false;
        if (nombreImagen != null ? !nombreImagen.equals(that.nombreImagen) : that.nombreImagen != null) return false;
        if (fechaCargaImagen != null ? !fechaCargaImagen.equals(that.fechaCargaImagen) : that.fechaCargaImagen != null)
            return false;
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
        result = idProducto;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + stock;
        temp = Double.doubleToLongBits(precioUnitario);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (urlImagen != null ? urlImagen.hashCode() : 0);
        result = 31 * result + (nombreImagen != null ? nombreImagen.hashCode() : 0);
        result = 31 * result + (fechaCargaImagen != null ? fechaCargaImagen.hashCode() : 0);
        result = 31 * result + (int) activo;
        result = 31 * result + (int) eliminado;
        result = 31 * result + (usuarioRegistro != null ? usuarioRegistro.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (usuarioEliminacion != null ? usuarioEliminacion.hashCode() : 0);
        result = 31 * result + (fechaEliminacion != null ? fechaEliminacion.hashCode() : 0);
        result = 31 * result + categoriaId;
        return result;
    }

    public Collection<VentasappDetallenotaalmacenEntity> getVentasappDetallenotaalmacensByIdProducto() {
        return ventasappDetallenotaalmacensByIdProducto;
    }

    public void setVentasappDetallenotaalmacensByIdProducto(Collection<VentasappDetallenotaalmacenEntity> ventasappDetallenotaalmacensByIdProducto) {
        this.ventasappDetallenotaalmacensByIdProducto = ventasappDetallenotaalmacensByIdProducto;
    }

    public Collection<VentasappDetalleordencompraEntity> getVentasappDetalleordencomprasByIdProducto() {
        return ventasappDetalleordencomprasByIdProducto;
    }

    public void setVentasappDetalleordencomprasByIdProducto(Collection<VentasappDetalleordencompraEntity> ventasappDetalleordencomprasByIdProducto) {
        this.ventasappDetalleordencomprasByIdProducto = ventasappDetalleordencomprasByIdProducto;
    }

    public Collection<VentasappDetallepedidoventaEntity> getVentasappDetallepedidoventasByIdProducto() {
        return ventasappDetallepedidoventasByIdProducto;
    }

    public void setVentasappDetallepedidoventasByIdProducto(Collection<VentasappDetallepedidoventaEntity> ventasappDetallepedidoventasByIdProducto) {
        this.ventasappDetallepedidoventasByIdProducto = ventasappDetallepedidoventasByIdProducto;
    }

    public VentasappCategoriaEntity getVentasappCategoriaByCategoriaId() {
        return ventasappCategoriaByCategoriaId;
    }

    public void setVentasappCategoriaByCategoriaId(VentasappCategoriaEntity ventasappCategoriaByCategoriaId) {
        this.ventasappCategoriaByCategoriaId = ventasappCategoriaByCategoriaId;
    }
}
