package services;

/**
 * Annotation spring service example.
 * 
 * @author paolobonansea
 * 
 */
@org.springframework.stereotype.Service
public class HelloService {

	public String hello() {
		return "Hello world!";
	}

}