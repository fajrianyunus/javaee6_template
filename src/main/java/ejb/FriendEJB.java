package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import entity.Friend;

/**
 * Session Bean implementation class FriendEJB
 */
@Stateless
@LocalBean
@Named
public class FriendEJB {
	
	@PersistenceContext
	EntityManager em;
	
	@Inject
	Friend f;

    /**
     * Default constructor. 
     */
    public FriendEJB() {
        // TODO Auto-generated constructor stub
    }

    public List getList() {
    	CriteriaBuilder cb = em.getCriteriaBuilder();
    	CriteriaQuery<Friend> q = cb.createQuery(Friend.class);
    	Root<Friend> c = q.from(Friend.class);
    	q.select(c);
    	TypedQuery<Friend> query = em.createQuery(q);
    	List<Friend> results = query.getResultList();    	
    	return results;
    }
    
    public String getName(int id) {
    	Friend f = (Friend) getList().get(id);
    	return f.getName();
    }
    
    public void create() {
    	Friend friend = new Friend();
    	friend.setName(f.getName());
    	friend.setAge(f.getAge());
    	em.persist(friend);
    }
}
