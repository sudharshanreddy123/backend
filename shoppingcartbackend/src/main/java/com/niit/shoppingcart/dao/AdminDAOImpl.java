
package com.niit.shoppingcart.dao;

import java.util.List;




import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Admin;

@Repository("adminDAO")
public class AdminDAOImpl implements AdminDAO {
	

	@Autowired
	private SessionFactory sessionFactory;


	public AdminDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Transactional
	public void saveOrUpdate(Admin admin) {
		sessionFactory.getCurrentSession().saveOrUpdate(admin);
	
			
	}

	@Transactional
	public void delete(String id) {
		Admin admin = new Admin();
		admin.setId(id);
		sessionFactory.getCurrentSession().delete(admin);
	}

	@Transactional
	public Admin get(String id) {
		String hql = "from Admin where id=" + "'"+ id +"'";
		//  from admin where id = '101'
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		List<Admin> listAdmin = (List<Admin>) query.list();
		
		if (listAdmin != null && !listAdmin.isEmpty()) {
			return listAdmin.get(0);
		}
		return null;
	}
	
	@Transactional
	public List<Admin> list() {
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Admin> listAdmin = (List<Admin>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Admin.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listAdmin;
	}
	
	


}
