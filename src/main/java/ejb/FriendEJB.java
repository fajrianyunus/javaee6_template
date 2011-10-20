package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Friend;

/**
 * Session Bean implementation class FriendEJB
 */
@Stateless
@LocalBean
public class FriendEJB {
	
	@PersistenceContext
	EntityManager em;

    /**
     * Default constructor. 
     */
    public FriendEJB() {
        // TODO Auto-generated constructor stub
    }

    public List getList() {
    	return em.createQuery("select f from Friend f").getResultList();
    }
    
    public String getName(int id) {
    	Friend f = (Friend) getList().get(id);
    	return f.getName();
    }
}
