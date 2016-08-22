package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;

public class TestCaseProduct {

  
 static ProductDAO productDAO;
  
  
  
 static Product product;
  
  
  static AnnotationConfigApplicationContext context;
  @BeforeClass
  public static void init()
  {
  context = new AnnotationConfigApplicationContext();
  context.scan("com.niit");
  context.refresh();
  product=(Product)  context.getBean("userDetails");
  productDAO= (ProductDAO) context.getBean("productDAO");
  
  
  }
  @Test
  public void ProductNameTest()
  {
	  product= productDAO.get("Pro143");
	  String name= product.getName();
	  assertEquals("Category Name Test " , "PRName143"       ,name);
  }
  
}
