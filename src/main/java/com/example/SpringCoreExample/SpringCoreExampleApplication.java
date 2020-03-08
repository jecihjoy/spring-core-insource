package com.example.SpringCoreExample;

import com.example.SpringCoreExample.basicApp.ArrayDao;
import com.example.SpringCoreExample.basicApp.ArrayService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.SpringCoreExample")
@PropertySource("classpath:app.properties")
public class SpringCoreExampleApplication {

	private static Log log = LogFactory.getLog(SpringCoreExampleApplication.class);

	public static void main(String[] args) {
		log.info("Application running");
		try(AnnotationConfigApplicationContext applicationContext =
					new AnnotationConfigApplicationContext(SpringCoreExampleApplication.class)){
			ArrayService arrayService = applicationContext.getBean(ArrayService.class);
			log.info("The sum of the numbers is "+arrayService.getSum());

			arrayService.getServerUrl();

			//prototype scope with proxy
			ArrayDao arrayDao1 = applicationContext.getBean(ArrayDao.class,args);
			ArrayDao arrayDao2 = applicationContext.getBean(ArrayDao.class,args);
			log.info("arrayDao1 " + arrayDao1);
			log.info("arrayDao2 " + arrayDao2);
		}

	}

}
