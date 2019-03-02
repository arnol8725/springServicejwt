package com.escom.compras.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="tarjetas")
public class Tarjeta implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id_tarjeta;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	private Banco banco; 
	
	
	
	@Column(name="descp_tarjeta")
	public String descp_tarjeta;
	@Column(name="status")
	public int status;
	public Tarjeta() {	
	}
	public long getId_tarjeta() {
		return id_tarjeta;
	}
	public void setId_tarjeta(long id_tarjeta) {
		this.id_tarjeta = id_tarjeta;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public String getDescp_tarjeta() {
		return descp_tarjeta;
	}
	public void setDescp_tarjeta(String descp_tarjeta) {
		this.descp_tarjeta = descp_tarjeta;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Tarjeta [id_tarjeta=" + id_tarjeta + ", banco=" + banco + ", descp_tarjeta=" + descp_tarjeta
				+ ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
