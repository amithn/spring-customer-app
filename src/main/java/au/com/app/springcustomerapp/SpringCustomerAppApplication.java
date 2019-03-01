package au.com.app.springcustomerapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
@RestController
public class SpringCustomerAppApplication {

	@Value("${DEPLOYMENT_TYPE:DONT_KNOW}")
	private String deploymentType;

	public static void main(String[] args) {
		SpringApplication.run(SpringCustomerAppApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Hello helloWorld() {
		return new Hello("Hello from Cloud Foundry Spinnaker - TEST RUN 4  : " + deploymentType);
	}

	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public Result add(@RequestBody  Customer customer) {
		// Save the database
		return new Result( customer.getName().toLowerCase() , "OK");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("deploymentType = " + deploymentType);
	}
}
