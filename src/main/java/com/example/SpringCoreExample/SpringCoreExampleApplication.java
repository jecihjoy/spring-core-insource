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
		log.info("Application running");
		try(AnnotationConfigApplicationContext applicationContext =
					new AnnotationConfigApplicationContext(SpringCoreExampleApplication.class)){
			log.info("beans" +applicationContext.getBeanDefinitionNames());
			ArrayService arrayService = applicationContext.getBean(ArrayService.class);
			log.info("The sum of the numbers is "+arrayService.getSum());
			//applicationContext.close();
		}

	}

}
