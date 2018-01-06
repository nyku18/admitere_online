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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NYKU
 */
@Entity
@Table(name = "CANDIDAT_OPTIUNE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CandidatOptiune.findAll", query = "SELECT c FROM CandidatOptiune c")})
public class CandidatOptiune implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CANDIDAT")
    private long idCandidat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_OPTIUNE")
    private long idOptiune;

    public CandidatOptiune() {
    }

    public CandidatOptiune(Long id) {
        this.id = id;
    }

    public CandidatOptiune(Long id, long idCandidat, long idOptiune) {
        this.id = id;
        this.idCandidat = idCandidat;
        this.idOptiune = idOptiune;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(long idCandidat) {
        this.idCandidat = idCandidat;
    }

    public long getIdOptiune() {
        return idOptiune;
    }

    public void setIdOptiune(long idOptiune) {
        this.idOptiune = idOptiune;
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
        if (!(object instanceof CandidatOptiune)) {
            return false;
        }
        CandidatOptiune other = (CandidatOptiune) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admitere.CandidatOptiune[ id=" + id + " ]";
    }
    
}
