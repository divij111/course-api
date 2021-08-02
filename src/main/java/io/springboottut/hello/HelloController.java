package io.springboottut.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //map to the request
public class HelloController {

	@RequestMapping("/hello") //maps to the controller and it is get by default and if we want another annotations we need to specify in annotations. 
	public String sayHi() {
		return "Hi";
	}
	@RequestMapping("/hi")
	public String sayHello() {
		return "Hello";
	}

}
