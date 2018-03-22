package tech.iooo.maven.archetypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import tech.iooo.maven.archetypes.service.HelloService;

/**
 * Hello world!
 *
 * @author Ivan97
 */
@Configuration
@ComponentScan
@ImportResource({"classpath:META-INF/spring/spring-context.xml"})
public class Application {

  private static final Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
    HelloService helloService = context.getBean(HelloService.class);
    logger.info("{}", helloService.sayHello());
  }
}
