package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

public class TestCaseSupplier {

  
 static SupplierDAO supplierDAO;
  
  
  
 static Supplier supplier;
  
  
  static AnnotationConfigApplicationContext context;
  @BeforeClass
  public static void init()
  {
  context = new AnnotationConfigApplicationContext();
  context.scan("com.niit");
  context.refresh();
  supplier=(Supplier)  context.getBean("userDetails");
  supplierDAO= (SupplierDAO) context.getBean("supplierDAO");
  
  
  }
  @Test
  public void SupplierNameTest()
  {
	  supplier= supplierDAO.get("CG101");
	  String name= supplier.getName();
	  assertEquals("Supplier Name Test " , "CG101"       ,name);
  }
  
}
