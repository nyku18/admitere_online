/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admitere.Operations;

import admitere.CandidatOptiune;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author NYKU
 */
@Stateless
public class CandidateOptionOperation {
    @PersistenceContext(unitName = "AdmitereOnlinePU")
    private EntityManager entityManager;
    
    public void add(CandidatOptiune candidateoption) {
        entityManager.persist(candidateoption);
    }
    
    public void delete(Integer id) {
        entityManager.remove(getItemById(id));
    }
    
    public CandidatOptiune getItemById(Integer id) {
        return entityManager.find(CandidatOptiune.class, id);
    }
    
    public void update(CandidatOptiune candidateoption) {
        entityManager.merge(candidateoption);
    }
    
    public List<CandidatOptiune> getAll() {
        return entityManager.createNamedQuery("CandidatOptiune.findAll").getResultList();
    }

    
}
