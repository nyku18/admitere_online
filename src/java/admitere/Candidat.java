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
 * @author NYKU
 */
@Entity
@Table(name = "CANDIDAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidat.findAll", query = "SELECT c FROM Candidat c"),
    @NamedQuery(name = "Candidat.findById", query = "SELECT c FROM Candidat c WHERE c.id = :id"),
    @NamedQuery(name = "Candidat.findByNume", query = "SELECT c FROM Candidat c WHERE c.nume = :nume"),
    @NamedQuery(name = "Candidat.findByPrenume", query = "SELECT c FROM Candidat c WHERE c.prenume = :prenume"),
    @NamedQuery(name = "Candidat.findByInitialaTata", query = "SELECT c FROM Candidat c WHERE c.initialaTata = :initialaTata"),
    @NamedQuery(name = "Candidat.findByCnp", query = "SELECT c FROM Candidat c WHERE c.cnp = :cnp"),
    @NamedQuery(name = "Candidat.findByAdresa", query = "SELECT c FROM Candidat c WHERE c.adresa = :adresa"),
    @NamedQuery(name = "Candidat.findByTelefon", query = "SELECT c FROM Candidat c WHERE c.telefon = :telefon"),
    @NamedQuery(name = "Candidat.findByEmail", query = "SELECT c FROM Candidat c WHERE c.email = :email")})
public class Candidat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUME")
    private String nume;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "PRENUME")
    private String prenume;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "INITIALA_TATA")
    private String initialaTata;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CNP")
    private long cnp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ADRESA")
    private String adresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFON")
    private long telefon;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "EMAIL")
    private String email;

    public Candidat() {
    }

    public Candidat(Long id) {
        this.id = id;
    }

    public Candidat(Long id, String nume, String prenume, String initialaTata, long cnp, String adresa, long telefon, String email) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.initialaTata = initialaTata;
        this.cnp = cnp;
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
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

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getInitialaTata() {
        return initialaTata;
    }

    public void setInitialaTata(String initialaTata) {
        this.initialaTata = initialaTata;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Candidat)) {
            return false;
        }
        Candidat other = (Candidat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admitere.Candidat[ id=" + id + " ]";
    }
    
}
