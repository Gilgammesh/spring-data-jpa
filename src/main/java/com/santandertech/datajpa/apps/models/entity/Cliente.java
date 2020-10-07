package com.santandertech.datajpa.apps.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;

	@Getter @Setter private String nombre;
	@Getter	@Setter	private String apellido;
	@Getter	@Setter private String email;

	@Column(name = "creado_at")
	@Temporal(TemporalType.DATE)
	@Getter @Setter private Date createAt;

}
