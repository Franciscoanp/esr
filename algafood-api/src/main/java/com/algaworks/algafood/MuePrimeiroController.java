package com.algaworks.algafood;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MuePrimeiroController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "asdasdasd!";
	}
	
}
