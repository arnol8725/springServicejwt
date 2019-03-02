package com.escom.compras.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.escom.compras.entity.Tarjeta;


@Repository("tarjetaRepositoryCru")
public interface ITarjetaDao extends CrudRepository<Tarjeta, Long> {

}
