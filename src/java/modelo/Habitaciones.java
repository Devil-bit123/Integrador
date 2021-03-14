/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HAZE
 */
@Entity
@Table(name = "habitaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitaciones.findAll", query = "SELECT h FROM Habitaciones h")
    , @NamedQuery(name = "Habitaciones.findByCodHab", query = "SELECT h FROM Habitaciones h WHERE h.codHab = :codHab")
    , @NamedQuery(name = "Habitaciones.findByNombre", query = "SELECT h FROM Habitaciones h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Habitaciones.findByDescHab", query = "SELECT h FROM Habitaciones h WHERE h.descHab = :descHab")
    , @NamedQuery(name = "Habitaciones.findByPrecio", query = "SELECT h FROM Habitaciones h WHERE h.precio = :precio")
    , @NamedQuery(name = "Habitaciones.findByEstadoHab", query = "SELECT h FROM Habitaciones h WHERE h.estadoHab = :estadoHab")})
public class Habitaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_hab")
    private Integer codHab;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "desc_hab")
    private String descHab;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_hab")
    private Character estadoHab;

    public Habitaciones() {
    }

    public Habitaciones(Integer codHab) {
        this.codHab = codHab;
    }

    public Habitaciones(Integer codHab, String nombre, String descHab, double precio, Character estadoHab) {
        this.codHab = codHab;
        this.nombre = nombre;
        this.descHab = descHab;
        this.precio = precio;
        this.estadoHab = estadoHab;
    }

    public Integer getCodHab() {
        return codHab;
    }

    public void setCodHab(Integer codHab) {
        this.codHab = codHab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescHab() {
        return descHab;
    }

    public void setDescHab(String descHab) {
        this.descHab = descHab;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Character getEstadoHab() {
        return estadoHab;
    }

    public void setEstadoHab(Character estadoHab) {
        this.estadoHab = estadoHab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codHab != null ? codHab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitaciones)) {
            return false;
        }
        Habitaciones other = (Habitaciones) object;
        if ((this.codHab == null && other.codHab != null) || (this.codHab != null && !this.codHab.equals(other.codHab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Habitaciones[ codHab=" + codHab + " ]";
    }
    
}
