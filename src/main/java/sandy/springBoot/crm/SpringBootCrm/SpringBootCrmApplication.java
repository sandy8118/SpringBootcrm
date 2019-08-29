package sandy.springBoot.crm.SpringBootCrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//includes @Configuration,@EnableAutoConfiguration,@ComponentScan
@SpringBootApplication
/* Composed of following Annotations
 * @EnableAutoConfiguaration,@ComponentScan,@Configuaration
 * @EnableAutoConfiguration annotation auto-configures the beans that are
 * present in the classpath. This simplifies the developers work by guessing the
 * required beans from the classpath and configure it to run the application.
 */
public class SpringBootCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrmApplication.class, args);
	}

}

/* By default spring Boot will load all the properties from application.properties file 
 * 
 * 
 * 
 *  */
