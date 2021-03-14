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
@Table(name = "hotel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
    , @NamedQuery(name = "Hotel.findByCodHot", query = "SELECT h FROM Hotel h WHERE h.codHot = :codHot")
    , @NamedQuery(name = "Hotel.findByNombre", query = "SELECT h FROM Hotel h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Hotel.findByTelf", query = "SELECT h FROM Hotel h WHERE h.telf = :telf")
    , @NamedQuery(name = "Hotel.findByDir", query = "SELECT h FROM Hotel h WHERE h.dir = :dir")
    , @NamedQuery(name = "Hotel.findByRuc", query = "SELECT h FROM Hotel h WHERE h.ruc = :ruc")
    , @NamedQuery(name = "Hotel.findByCodEmp", query = "SELECT h FROM Hotel h WHERE h.codEmp = :codEmp")
    , @NamedQuery(name = "Hotel.findByCodHab", query = "SELECT h FROM Hotel h WHERE h.codHab = :codHab")
    , @NamedQuery(name = "Hotel.findByCodClien", query = "SELECT h FROM Hotel h WHERE h.codClien = :codClien")
    , @NamedQuery(name = "Hotel.findByEstadoHot", query = "SELECT h FROM Hotel h WHERE h.estadoHot = :estadoHot")})
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_hot")
    private Integer codHot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telf")
    private int telf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "dir")
    private String dir;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ruc")
    private int ruc;
    @Column(name = "cod_emp")
    private Integer codEmp;
    @Column(name = "cod_hab")
    private Integer codHab;
    @Column(name = "cod_clien")
    private Integer codClien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_hot")
    private Character estadoHot;

    public Hotel() {
    }

    public Hotel(Integer codHot) {
        this.codHot = codHot;
    }

    public Hotel(Integer codHot, String nombre, int telf, String dir, int ruc, Character estadoHot) {
        this.codHot = codHot;
        this.nombre = nombre;
        this.telf = telf;
        this.dir = dir;
        this.ruc = ruc;
        this.estadoHot = estadoHot;
    }

    public Integer getCodHot() {
        return codHot;
    }

    public void setCodHot(Integer codHot) {
        this.codHot = codHot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public Integer getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(Integer codEmp) {
        this.codEmp = codEmp;
    }

    public Integer getCodHab() {
        return codHab;
    }

    public void setCodHab(Integer codHab) {
        this.codHab = codHab;
    }

    public Integer getCodClien() {
        return codClien;
    }

    public void setCodClien(Integer codClien) {
        this.codClien = codClien;
    }

    public Character getEstadoHot() {
        return estadoHot;
    }

    public void setEstadoHot(Character estadoHot) {
        this.estadoHot = estadoHot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codHot != null ? codHot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.codHot == null && other.codHot != null) || (this.codHot != null && !this.codHot.equals(other.codHot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Hotel[ codHot=" + codHot + " ]";
    }
    
}
