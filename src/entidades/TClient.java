/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author casti
 */
@Entity
@Table(name = "tclient", catalog = "sql11466235", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tclient.findAll", query = "SELECT t FROM Tclient t")})
public class TClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NIF", nullable = false, length = 50)
    private String nif;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 250)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APELLIDOS", nullable = false, length = 250)
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "EDAD", nullable = false)
    private int edad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nif", fetch = FetchType.LAZY)
    private Collection<TEye> teyeCollection;

    public TClient() {
    }

    public TClient(String nif) {
        this.nif = nif;
    }

    public TClient(String nif, String nombre, String apellidos, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Collection<TEye> getTeyeCollection() {
        return teyeCollection;
    }

    public void setTeyeCollection(Collection<TEye> teyeCollection) {
        this.teyeCollection = teyeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nif != null ? nif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TClient)) {
            return false;
        }
        TClient other = (TClient) object;
        if ((this.nif == null && other.nif != null) || (this.nif != null && !this.nif.equals(other.nif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tclient[ nif=" + nif + " ]";
    }
    
}
