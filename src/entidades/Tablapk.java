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
@Table(name = "tablapk")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tablapk.findAll", query = "SELECT t FROM Tablapk t"),
    @NamedQuery(name = "Tablapk.findByCodigo", query = "SELECT t FROM Tablapk t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "Tablapk.findByNombre", query = "SELECT t FROM Tablapk t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tablapk.findByValor", query = "SELECT t FROM Tablapk t WHERE t.valor = :valor")})
public class Tablapk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "valor")
    private Integer valor;

    public Tablapk() {
    }

    public Tablapk(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
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
        if (!(object instanceof Tablapk)) {
            return false;
        }
        Tablapk other = (Tablapk) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tablapk[ codigo=" + codigo + " ]";
    }
    
}
