package com.escom.compras.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.escom.compras.dao.IBancoDao;
import com.escom.compras.entity.Banco;
import com.escom.compras.service.IBancoService;
import com.fasterxml.jackson.core.sym.Name;


@Service("banco_service")
public class BancoServiceImpl implements IBancoService {
	
	List<Banco> detBanco = new ArrayList<Banco>();
	
	
	@Autowired
	@Qualifier("bancoRepositoryCru")
	public IBancoDao bancoDao;

	@Override
	public List<Banco> detBanco() {
		// TODO Auto-generated method stub
		detBanco = (List<Banco>) bancoDao.findAll();
		return detBanco;
	}

}
