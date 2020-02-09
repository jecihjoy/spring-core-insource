package com.example.SpringCoreExample;

import com.example.SpringCoreExample.basicApp.ArrayService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.SpringCoreExample")
public class SpringCoreExampleApplication {

	private static Log log = LogFactory.getLog(SpringCoreExampleApplication.class);

	public static void main(String[] args) {
		log.error("I'm soo used to error logs");
		ApplicationContext applicationContext = SpringApplication.run(SpringCoreExampleApplication.class, args);
		log.error("beans" +applicationContext.getBeanDefinitionNames());
		ArrayService arrayService = applicationContext.getBean(ArrayService.class);
		log.info("The sum of the numbers is "+arrayService.getSum());
	}

}
