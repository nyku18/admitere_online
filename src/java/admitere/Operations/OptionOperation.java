/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admitere.Operations;

import admitere.Optiune;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author NYKU
 */

@Stateless
public class OptionOperation {
    @PersistenceContext(unitName = "AdmitereOnlinePU")
    private EntityManager entityManager;
    
    public void add(Optiune option) {
        entityManager.persist(option);
    }
    
    public void delete(Integer id) {
        entityManager.remove(getItemById(id));
    }
    
    public Optiune getItemById(Integer id) {
        return entityManager.find(Optiune.class, id);
    }
    
    public void update(Optiune option) {
        entityManager.merge(option);
    }
    
    public List<Optiune> getAll() {
        return entityManager.createNamedQuery("Optiune.findAll").getResultList();
    }
    
}
