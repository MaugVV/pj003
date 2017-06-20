/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MAURO
 */
@Entity
@Table(name = "parametrossistema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametrossistema.findAll", query = "SELECT p FROM Parametrossistema p"),
    @NamedQuery(name = "Parametrossistema.findByCodigo", query = "SELECT p FROM Parametrossistema p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Parametrossistema.findByParametro", query = "SELECT p FROM Parametrossistema p WHERE p.parametro = :parametro"),
    @NamedQuery(name = "Parametrossistema.findByDescripcion", query = "SELECT p FROM Parametrossistema p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Parametrossistema.findByNombre", query = "SELECT p FROM Parametrossistema p WHERE p.nombre = :nombre")})
public class Parametrossistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "parametro")
    private String parametro;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "nombre")
    private String nombre;

    public Parametrossistema() {
    }

    public Parametrossistema(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof Parametrossistema)) {
            return false;
        }
        Parametrossistema other = (Parametrossistema) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Parametrossistema[ codigo=" + codigo + " ]";
    }
    
}
