/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admitere.Operations;

import admitere.Candidat;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author NYKU
 */
@Stateless
public class CandidateOperation {
    @PersistenceContext(unitName = "AdmitereOnlinePU")
    private EntityManager entityManager;
    
    public void add(Candidat candidate) {
        entityManager.persist(candidate);
    }
    
    public void delete(Long id) {
        entityManager.remove(getItemById(id));
    }
    
    public Candidat getItemById(Long id) {
        return entityManager.find(Candidat.class, id);
    }
    
    public void update(Candidat candidate) {
        entityManager.merge(candidate);
    }
    
    public List<Candidat> getAll() {
        return entityManager.createNamedQuery("Candidat.findAll").getResultList();
    }

    
}
