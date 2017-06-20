/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MAURO
 */
@Entity
@Table(name = "pantallas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pantallas.findAll", query = "SELECT p FROM Pantallas p"),
    @NamedQuery(name = "Pantallas.findByCodigo", query = "SELECT p FROM Pantallas p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Pantallas.findByPantalla", query = "SELECT p FROM Pantallas p WHERE p.pantalla = :pantalla"),
    @NamedQuery(name = "Pantallas.findByDescripcion", query = "SELECT p FROM Pantallas p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Pantallas.findByCodigoMenu", query = "SELECT p FROM Pantallas p WHERE p.codigoMenu = :codigoMenu"),
    @NamedQuery(name = "Pantallas.findByEstado", query = "SELECT p FROM Pantallas p WHERE p.estado = :estado")})
public class Pantallas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "pantalla")
    private String pantalla;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "codigo_menu")
    private String codigoMenu;
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "codigopantalla")
    private Collection<Perfilpantalla> perfilpantallaCollection;

    public Pantallas() {
    }

    public Pantallas(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(String codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Perfilpantalla> getPerfilpantallaCollection() {
        return perfilpantallaCollection;
    }

    public void setPerfilpantallaCollection(Collection<Perfilpantalla> perfilpantallaCollection) {
        this.perfilpantallaCollection = perfilpantallaCollection;
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
        if (!(object instanceof Pantallas)) {
            return false;
        }
        Pantallas other = (Pantallas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pantallas[ codigo=" + codigo + " ]";
    }
    
}
