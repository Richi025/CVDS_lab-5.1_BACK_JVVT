package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

	@CrossOrigin
	@GetMapping("/api/hello")
	public String home(){
		return "Hello World Spring Boot";
	}

	@RequestMapping("/api/home")
	@GetMapping
	public String newhome(){
		return "<html> <body> <h1> Hello World New Spring Boot</h1> </body> </html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

}