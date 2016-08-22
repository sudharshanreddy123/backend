package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.dao.AdminDAO;
import com.niit.shoppingcart.model.Admin;

public class AdminTest {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		
	   AdminDAO adminDAO = 	(AdminDAO) context.getBean("adminDAO");
	   
	   Admin admin = 	(Admin) context.getBean("admin");
	   admin.setId("ADM199");
	   
	   admin.setPassword("xxxxxx");
	   
	   
	   
	   
	   adminDAO.saveOrUpdate(admin);
	   System.out.println(" No of admins" + adminDAO.list().size());
	   
			   
	   
	/*   
	   
	  if(   adminDAO.get("sdfsf") ==null)
	  {
		  System.out.println("Admin does not exist");
	  }
	  else
	  {
		  System.out.println("Admin exist .. the details are ..");
		  System.out.println();
	  }
		*/
		
		
	}

}
