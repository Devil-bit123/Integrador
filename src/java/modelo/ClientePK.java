/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HAZE
 */
@Embeddable
public class ClientePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cod_clien")
    private int codClien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre_clien")
    private String nombreClien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "apellido_clien")
    private String apellidoClien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ced_clien")
    private int cedClien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "dir_clien")
    private String dirClien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telf_clien")
    private int telfClien;

    public ClientePK() {
    }

    public ClientePK(int codClien, String nombreClien, String apellidoClien, int cedClien, String dirClien, int telfClien) {
        this.codClien = codClien;
        this.nombreClien = nombreClien;
        this.apellidoClien = apellidoClien;
        this.cedClien = cedClien;
        this.dirClien = dirClien;
        this.telfClien = telfClien;
    }

    public int getCodClien() {
        return codClien;
    }

    public void setCodClien(int codClien) {
        this.codClien = codClien;
    }

    public String getNombreClien() {
        return nombreClien;
    }

    public void setNombreClien(String nombreClien) {
        this.nombreClien = nombreClien;
    }

    public String getApellidoClien() {
        return apellidoClien;
    }

    public void setApellidoClien(String apellidoClien) {
        this.apellidoClien = apellidoClien;
    }

    public int getCedClien() {
        return cedClien;
    }

    public void setCedClien(int cedClien) {
        this.cedClien = cedClien;
    }

    public String getDirClien() {
        return dirClien;
    }

    public void setDirClien(String dirClien) {
        this.dirClien = dirClien;
    }

    public int getTelfClien() {
        return telfClien;
    }

    public void setTelfClien(int telfClien) {
        this.telfClien = telfClien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codClien;
        hash += (nombreClien != null ? nombreClien.hashCode() : 0);
        hash += (apellidoClien != null ? apellidoClien.hashCode() : 0);
        hash += (int) cedClien;
        hash += (dirClien != null ? dirClien.hashCode() : 0);
        hash += (int) telfClien;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientePK)) {
            return false;
        }
        ClientePK other = (ClientePK) object;
        if (this.codClien != other.codClien) {
            return false;
        }
        if ((this.nombreClien == null && other.nombreClien != null) || (this.nombreClien != null && !this.nombreClien.equals(other.nombreClien))) {
            return false;
        }
        if ((this.apellidoClien == null && other.apellidoClien != null) || (this.apellidoClien != null && !this.apellidoClien.equals(other.apellidoClien))) {
            return false;
        }
        if (this.cedClien != other.cedClien) {
            return false;
        }
        if ((this.dirClien == null && other.dirClien != null) || (this.dirClien != null && !this.dirClien.equals(other.dirClien))) {
            return false;
        }
        if (this.telfClien != other.telfClien) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ClientePK[ codClien=" + codClien + ", nombreClien=" + nombreClien + ", apellidoClien=" + apellidoClien + ", cedClien=" + cedClien + ", dirClien=" + dirClien + ", telfClien=" + telfClien + " ]";
    }
    
}
