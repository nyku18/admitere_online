/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admitere;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NYKU
 */
@Entity
@Table(name = "OPTIUNE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Optiune.findAll", query = "SELECT o FROM Optiune o"),
    @NamedQuery(name = "Optiune.findById", query = "SELECT o FROM Optiune o WHERE o.id = :id"),
    @NamedQuery(name = "Optiune.findByNume", query = "SELECT o FROM Optiune o WHERE o.nume = :nume"),
    @NamedQuery(name = "Optiune.findByTipAdmitere", query = "SELECT o FROM Optiune o WHERE o.tipAdmitere = :tipAdmitere")})
public class Optiune implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NUME")
    private String nume;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TIP_ADMITERE")
    private String tipAdmitere;

    public Optiune() {
    }

    public Optiune(Long id) {
        this.id = id;
    }

    public Optiune(Long id, String nume, String tipAdmitere) {
        this.id = id;
        this.nume = nume;
        this.tipAdmitere = tipAdmitere;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTipAdmitere() {
        return tipAdmitere;
    }

    public void setTipAdmitere(String tipAdmitere) {
        this.tipAdmitere = tipAdmitere;
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
        if (!(object instanceof Optiune)) {
            return false;
        }
        Optiune other = (Optiune) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admitere.Optiune[ id=" + id + " ]";
    }
    
}
