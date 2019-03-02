package com.escom.compras.dao;

import org.springframework.data.repository.CrudRepository;

import com.escom.compras.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	public Usuario findByUsername(String username);
}
