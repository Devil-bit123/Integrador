/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HAZE
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByCodClien", query = "SELECT c FROM Cliente c WHERE c.clientePK.codClien = :codClien")
    , @NamedQuery(name = "Cliente.findByNombreClien", query = "SELECT c FROM Cliente c WHERE c.clientePK.nombreClien = :nombreClien")
    , @NamedQuery(name = "Cliente.findByApellidoClien", query = "SELECT c FROM Cliente c WHERE c.clientePK.apellidoClien = :apellidoClien")
    , @NamedQuery(name = "Cliente.findByCedClien", query = "SELECT c FROM Cliente c WHERE c.clientePK.cedClien = :cedClien")
    , @NamedQuery(name = "Cliente.findByDirClien", query = "SELECT c FROM Cliente c WHERE c.clientePK.dirClien = :dirClien")
    , @NamedQuery(name = "Cliente.findByTelfClien", query = "SELECT c FROM Cliente c WHERE c.clientePK.telfClien = :telfClien")
    , @NamedQuery(name = "Cliente.findByEstadoClien", query = "SELECT c FROM Cliente c WHERE c.estadoClien = :estadoClien")
    , @NamedQuery(name = "Cliente.findByCodCab", query = "SELECT c FROM Cliente c WHERE c.codCab = :codCab")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClientePK clientePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_clien")
    private Character estadoClien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_cab")
    private int codCab;

    public Cliente() {
    }

    public Cliente(ClientePK clientePK) {
        this.clientePK = clientePK;
    }

    public Cliente(ClientePK clientePK, Character estadoClien, int codCab) {
        this.clientePK = clientePK;
        this.estadoClien = estadoClien;
        this.codCab = codCab;
    }

    public Cliente(int codClien, String nombreClien, String apellidoClien, int cedClien, String dirClien, int telfClien) {
        this.clientePK = new ClientePK(codClien, nombreClien, apellidoClien, cedClien, dirClien, telfClien);
    }

    public ClientePK getClientePK() {
        return clientePK;
    }

    public void setClientePK(ClientePK clientePK) {
        this.clientePK = clientePK;
    }

    public Character getEstadoClien() {
        return estadoClien;
    }

    public void setEstadoClien(Character estadoClien) {
        this.estadoClien = estadoClien;
    }

    public int getCodCab() {
        return codCab;
    }

    public void setCodCab(int codCab) {
        this.codCab = codCab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientePK != null ? clientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clientePK == null && other.clientePK != null) || (this.clientePK != null && !this.clientePK.equals(other.clientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Cliente[ clientePK=" + clientePK + " ]";
    }
    
}
