package demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfigurate2 {
	
	@Bean(name="h")
	public Home getHome() {
		Home home = new Home();
		home.setAddress("¶«Ê¤ÉñÖÝ");
		return home;
	}
	
	@Bean(name="person", initMethod="init")
	public Person getPerson() {
		Person person =  new Person("xingoo", 23);
		return person;
	}
}
