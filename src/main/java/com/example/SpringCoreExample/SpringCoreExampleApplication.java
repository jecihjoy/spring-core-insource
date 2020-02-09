package com.example.SpringCoreExample;

import com.example.SpringCoreExample.basicApp.ArrayService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.SpringCoreExample")
public class SpringCoreExampleApplication {

	private static Log log = LogFactory.getLog(SpringCoreExampleApplication.class);

	public static void main(String[] args) {
		log.error("I'm soo used to error logs");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCoreExampleApplication.class);
		log.error("beans" +applicationContext.getBeanDefinitionNames());
		ArrayService arrayService = applicationContext.getBean(ArrayService.class);
		log.info("The sum of the numbers is "+arrayService.getSum());
	}

}
