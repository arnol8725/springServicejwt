package com.escom.compras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.escom.compras.entity.Banco;
import com.escom.compras.entity.Tarjeta;
import com.escom.compras.service.IBancoService;
import com.escom.compras.service.ITarjetaService;
import com.escom.compras.service.Impl.BancoServiceImpl;

@RestController()
@RequestMapping("/api/compras")
public class ControllerCompras {
	
	
	@Autowired
	@Qualifier("banco_service")
	private IBancoService banco_services;
	
	@Autowired
	@Qualifier("tarjeta_service")
	private ITarjetaService tarjeta_services;
	
	@GetMapping(value = "/bancos" )
	public List<Banco> listar() {
		return banco_services.detBanco();
	}
	
	@GetMapping(value = "/tarjetas" )
	public List<Tarjeta> tarjetas() {
		return tarjeta_services.detTarjeta();
	}

}
