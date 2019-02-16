package au.com.app.springcustomerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class SpringCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCustomerAppApplication.class, args);
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public Hello helloWorld() {
		return new Hello("Hello from Cloud Foundry Spinnaker - time here is : " + new Date().toString());
	}

	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public Result add(@RequestBody  Customer customer) {
		// Save the database
		return new Result( customer.getName().toLowerCase() , "OK");
	}
}
