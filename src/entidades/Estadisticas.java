/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MAURO
 */
@Entity
@Table(name = "estadisticas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadisticas.findAll", query = "SELECT e FROM Estadisticas e"),
    @NamedQuery(name = "Estadisticas.findByCodigo", query = "SELECT e FROM Estadisticas e WHERE e.codigo = :codigo"),
    @NamedQuery(name = "Estadisticas.findByFecha", query = "SELECT e FROM Estadisticas e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "Estadisticas.findByContidad", query = "SELECT e FROM Estadisticas e WHERE e.contidad = :contidad")})
public class Estadisticas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "contidad")
    private Integer contidad;
    @JoinColumn(name = "codigo_producto", referencedColumnName = "codigo")
    @ManyToOne
    private Inventario codigoProducto;

    public Estadisticas() {
    }

    public Estadisticas(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getContidad() {
        return contidad;
    }

    public void setContidad(Integer contidad) {
        this.contidad = contidad;
    }

    public Inventario getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Inventario codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadisticas)) {
            return false;
        }
        Estadisticas other = (Estadisticas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Estadisticas[ codigo=" + codigo + " ]";
    }
    
}
