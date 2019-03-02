package com.escom.compras.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.escom.compras.dao.ITarjetaDao;
import com.escom.compras.entity.Tarjeta;
import com.escom.compras.service.ITarjetaService;

@Service("tarjeta_service")
public class TarjetaServiceImpl implements ITarjetaService {
	
	public List<Tarjeta> detTarjeta = new ArrayList<Tarjeta>();
	
	
	@Autowired
	@Qualifier("tarjetaRepositoryCru")
	public ITarjetaDao tarjetadao;

	@Override
	public List<Tarjeta> detTarjeta() {
		// TODO Auto-generated method stub
		detTarjeta = (List<Tarjeta>) tarjetadao.findAll();
		return detTarjeta;
	}

}
