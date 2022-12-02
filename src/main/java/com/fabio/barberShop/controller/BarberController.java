package com.fabio.barberShop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/barber")
public class BarberController {
	
	@RequestMapping("/ola")
	public String exibirMensagem() {
		return "Hello Mundo!";
	}

}
