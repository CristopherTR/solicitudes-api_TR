package pe.edu.tecsup.solicitudesapi.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	private static Logger logger = LoggerFactory.getLogger(HelloController.class);	
	@GetMapping("/hello")
	public String index() {
		logger.info("call index");
		return "Hola mundo¡";
	}
}
	