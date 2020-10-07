package com.santandertech.datajpa.apps.models.dao;

import java.util.List;

import com.santandertech.datajpa.apps.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
	
}
