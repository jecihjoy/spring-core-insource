package com.example.SpringCoreExample;

import com.example.SpringCoreExample.XMLExample.UserDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.example.SpringCoreExample")
public class SpringCoreXmlExample {

    private static Log log = LogFactory.getLog(com.example.SpringCoreExample.SpringCoreExampleApplication.class);

    public static void main(String[] args) {
        log.info("Application running");
        try(ClassPathXmlApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml")){
            log.info("beans" +applicationContext.getBeanDefinitionNames());
            UserDao usersDao = applicationContext.getBean(UserDao.class);
            log.info("The connection used is "+usersDao.getXmlJdbcConnection());
            //applicationContext.close();
        }

    }
}
