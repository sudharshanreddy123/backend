package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;

public class TestCaseUser {

  
 static UserDAO userDAO;
  
  
  
 static User user;
  
  
  static AnnotationConfigApplicationContext context;
  @BeforeClass
  public static void init()
  {
  context = new AnnotationConfigApplicationContext();
  context.scan("com.niit");
  context.refresh();
  user=(User)  context.getBean("userDetails");
  userDAO= (UserDAO) context.getBean("userDAO");
  
  
  }
  @Test
  public void UserNameTest()
  {
	  user= userDAO.get("CG101");
	  String name= user.getId();
	  assertEquals("User Name Test " , "CG101"       ,name);
  }
  
}
