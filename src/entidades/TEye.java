/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author casti
 */
@Entity
@Table(name = "teye", catalog = "sql11466235", schema = "")
@NamedQueries({
    @NamedQuery(name = "Teye.findAll", query = "SELECT t FROM Teye t")})
public class TEye implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CONSULTA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date consulta;
    @Basic(optional = false)
    @Column(name = "OD_ESFERA", nullable = false)
    private double odEsfera;
    @Basic(optional = false)
    @Column(name = "OD_CILINDRO", nullable = false)
    private double odCilindro;
    @Basic(optional = false)
    @Column(name = "OD_ADICION", nullable = false)
    private double odAdicion;
    @Basic(optional = false)
    @Column(name = "OD_AGUDEZA", nullable = false)
    private double odAgudeza;
    @Basic(optional = false)
    @Column(name = "OI_ESFERA", nullable = false)
    private double oiEsfera;
    @Basic(optional = false)
    @Column(name = "OI_CILINDRO", nullable = false)
    private double oiCilindro;
    @Basic(optional = false)
    @Column(name = "OI_ADICION", nullable = false)
    private double oiAdicion;
    @Basic(optional = false)
    @Column(name = "OI_AGUDEZA", nullable = false)
    private double oiAgudeza;
    @JoinColumn(name = "NIF", referencedColumnName = "NIF", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TClient nif;

    public TEye() {
    }

    public TEye(Integer id) {
        this.id = id;
    }

    public TEye(Integer id, Date consulta, double odEsfera, double odCilindro, double odAdicion, double odAgudeza, double oiEsfera, double oiCilindro, double oiAdicion, double oiAgudeza) {
        this.id = id;
        this.consulta = consulta;
        this.odEsfera = odEsfera;
        this.odCilindro = odCilindro;
        this.odAdicion = odAdicion;
        this.odAgudeza = odAgudeza;
        this.oiEsfera = oiEsfera;
        this.oiCilindro = oiCilindro;
        this.oiAdicion = oiAdicion;
        this.oiAgudeza = oiAgudeza;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getConsulta() {
        return consulta;
    }

    public void setConsulta(Date consulta) {
        this.consulta = consulta;
    }

    public double getOdEsfera() {
        return odEsfera;
    }

    public void setOdEsfera(double odEsfera) {
        this.odEsfera = odEsfera;
    }

    public double getOdCilindro() {
        return odCilindro;
    }

    public void setOdCilindro(double odCilindro) {
        this.odCilindro = odCilindro;
    }

    public double getOdAdicion() {
        return odAdicion;
    }

    public void setOdAdicion(double odAdicion) {
        this.odAdicion = odAdicion;
    }

    public double getOdAgudeza() {
        return odAgudeza;
    }

    public void setOdAgudeza(double odAgudeza) {
        this.odAgudeza = odAgudeza;
    }

    public double getOiEsfera() {
        return oiEsfera;
    }

    public void setOiEsfera(double oiEsfera) {
        this.oiEsfera = oiEsfera;
    }

    public double getOiCilindro() {
        return oiCilindro;
    }

    public void setOiCilindro(double oiCilindro) {
        this.oiCilindro = oiCilindro;
    }

    public double getOiAdicion() {
        return oiAdicion;
    }

    public void setOiAdicion(double oiAdicion) {
        this.oiAdicion = oiAdicion;
    }

    public double getOiAgudeza() {
        return oiAgudeza;
    }

    public void setOiAgudeza(double oiAgudeza) {
        this.oiAgudeza = oiAgudeza;
    }

    public TClient getNif() {
        return nif;
    }

    public void setNif(TClient nif) {
        this.nif = nif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEye)) {
            return false;
        }
        TEye other = (TEye) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Teye[ id=" + id + " ]";
    }
    
}
