package demo.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
//@ComponentScan("demo.bean")
@ComponentScan(basePackages="demo")
public class DemoConfigurate {

}
