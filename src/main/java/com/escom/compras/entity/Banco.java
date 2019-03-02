package com.escom.compras.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "banco")
public class Banco implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_banco;
	@Column(name = "descp_banco")
	public String desp_banco;
	@Column(name = "status")
	public int status;
	
	@OneToMany(mappedBy="banco", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	//@JsonIgnore
	@JsonManagedReference
	private List<Tarjeta> tarjetas;

	public Banco() {

	}
	
	public Long getId_banco() {
		return id_banco;
	}

	public void setId_banco(Long id_banco) {
		this.id_banco = id_banco;
	}

	public String getDesp_banco() {
		return desp_banco;
	}

	public void setDesp_banco(String desp_banco) {
		this.desp_banco = desp_banco;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Banco [id_banco=" + id_banco + ", desp_banco=" + desp_banco + ", status=" + status + "]";
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
