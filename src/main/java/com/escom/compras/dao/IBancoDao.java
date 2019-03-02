package com.escom.compras.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.escom.compras.entity.Banco;


@Repository("bancoRepositoryCru")
public interface IBancoDao extends CrudRepository<Banco, Long> {

}
