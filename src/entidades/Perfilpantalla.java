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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MAURO
 */
@Entity
@Table(name = "perfilpantalla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perfilpantalla.findAll", query = "SELECT p FROM Perfilpantalla p"),
    @NamedQuery(name = "Perfilpantalla.findByCodigo", query = "SELECT p FROM Perfilpantalla p WHERE p.codigo = :codigo")})
public class Perfilpantalla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @JoinColumn(name = "codigopantalla", referencedColumnName = "codigo")
    @ManyToOne
    private Pantallas codigopantalla;
    @JoinColumn(name = "codigoperfil", referencedColumnName = "codigo")
    @ManyToOne
    private Perfil codigoperfil;

    public Perfilpantalla() {
    }

    public Perfilpantalla(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Pantallas getCodigopantalla() {
        return codigopantalla;
    }

    public void setCodigopantalla(Pantallas codigopantalla) {
        this.codigopantalla = codigopantalla;
    }

    public Perfil getCodigoperfil() {
        return codigoperfil;
    }

    public void setCodigoperfil(Perfil codigoperfil) {
        this.codigoperfil = codigoperfil;
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
        if (!(object instanceof Perfilpantalla)) {
            return false;
        }
        Perfilpantalla other = (Perfilpantalla) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Perfilpantalla[ codigo=" + codigo + " ]";
    }
    
}
