/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admitere.Operations;

import admitere.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author NYKU
 */
@Stateless
public class UsersOperation {
    @PersistenceContext(unitName = "AdmitereOnlinePU")
    private EntityManager entityManager;
    
    public boolean findByEmailAndParola(String email, String parola)
    {
        Query query = entityManager.createNamedQuery("Users.findByEmailAndParola");
        query.setParameter("email", email);
        query.setParameter("parola", parola);
        List<Users> allFoundUsers = query.getResultList();
        if(allFoundUsers.size() > 0)
        {
            return true;
        }
        
        return false;
        
    }
}
