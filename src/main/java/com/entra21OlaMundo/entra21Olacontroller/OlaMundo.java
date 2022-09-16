package com.entra21OlaMundo.entra21Olacontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundo {
	
	
	@RequestMapping(value="/ola", method = RequestMethod.GET)
	public String ola() {
		return "Olá";
	}
	

}
