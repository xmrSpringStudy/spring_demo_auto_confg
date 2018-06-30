package demo.bean.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.bean.DemoConfigurate;
import demo.bean.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class JTest2 {	  
	 @Autowired
	 private Person person;
	 
	 @Test
	 public void PersonTest() {
		 assertNotNull(person);
		 System.out.println(person.toString());
	 }
}
