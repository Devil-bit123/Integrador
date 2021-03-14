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
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByCodEmp", query = "SELECT e FROM Empleado e WHERE e.codEmp = :codEmp")
    , @NamedQuery(name = "Empleado.findByNombreEmp", query = "SELECT e FROM Empleado e WHERE e.nombreEmp = :nombreEmp")
    , @NamedQuery(name = "Empleado.findByApellidoEmp", query = "SELECT e FROM Empleado e WHERE e.apellidoEmp = :apellidoEmp")
    , @NamedQuery(name = "Empleado.findByCedEmp", query = "SELECT e FROM Empleado e WHERE e.cedEmp = :cedEmp")
    , @NamedQuery(name = "Empleado.findByDirEmp", query = "SELECT e FROM Empleado e WHERE e.dirEmp = :dirEmp")
    , @NamedQuery(name = "Empleado.findByTelf", query = "SELECT e FROM Empleado e WHERE e.telf = :telf")
    , @NamedQuery(name = "Empleado.findByCodRol", query = "SELECT e FROM Empleado e WHERE e.codRol = :codRol")
    , @NamedQuery(name = "Empleado.findByEstadoEmp", query = "SELECT e FROM Empleado e WHERE e.estadoEmp = :estadoEmp")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_emp")
    private Integer codEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre_emp")
    private String nombreEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "apellido_emp")
    private String apellidoEmp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ced_emp")
    private int cedEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "dir_emp")
    private String dirEmp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telf")
    private int telf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_rol")
    private int codRol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_emp")
    private Character estadoEmp;

    public Empleado() {
    }

    public Empleado(Integer codEmp) {
        this.codEmp = codEmp;
    }

    public Empleado(Integer codEmp, String nombreEmp, String apellidoEmp, int cedEmp, String dirEmp, int telf, int codRol, Character estadoEmp) {
        this.codEmp = codEmp;
        this.nombreEmp = nombreEmp;
        this.apellidoEmp = apellidoEmp;
        this.cedEmp = cedEmp;
        this.dirEmp = dirEmp;
        this.telf = telf;
        this.codRol = codRol;
        this.estadoEmp = estadoEmp;
    }

    public Integer getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(Integer codEmp) {
        this.codEmp = codEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getApellidoEmp() {
        return apellidoEmp;
    }

    public void setApellidoEmp(String apellidoEmp) {
        this.apellidoEmp = apellidoEmp;
    }

    public int getCedEmp() {
        return cedEmp;
    }

    public void setCedEmp(int cedEmp) {
        this.cedEmp = cedEmp;
    }

    public String getDirEmp() {
        return dirEmp;
    }

    public void setDirEmp(String dirEmp) {
        this.dirEmp = dirEmp;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public int getCodRol() {
        return codRol;
    }

    public void setCodRol(int codRol) {
        this.codRol = codRol;
    }

    public Character getEstadoEmp() {
        return estadoEmp;
    }

    public void setEstadoEmp(Character estadoEmp) {
        this.estadoEmp = estadoEmp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEmp != null ? codEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.codEmp == null && other.codEmp != null) || (this.codEmp != null && !this.codEmp.equals(other.codEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Empleado[ codEmp=" + codEmp + " ]";
    }
    
}
