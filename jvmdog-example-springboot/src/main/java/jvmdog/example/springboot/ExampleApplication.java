package jvmdog.example.springboot;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "jvmdog"
})
public class ExampleApplication {
	public static void main(String[] args){
	    SpringApplication springApplication = new SpringApplication(ExampleApplication.class);
//	    springApplication.setResourceLoader(resourceLoader);
	    
	    ConfigurableApplicationContext context = springApplication.run(args);
	    AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
	    
//	    MyService myService = new MyService();
//	    beanFactory.autowireBean(myService);
	    
//	    MyService myServiceBean = beanFactory.getBean(MyService.class);
//	    System.out.println("myServiceBean: "+ myService);
	}
}
