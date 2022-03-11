package com.nttdata.demoweb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.demoweb.repository.EmpleadoRepo;
import com.nttdata.demoweb.repository.EmpleadoRepoJPA;
import com.nttdata.demoweb.repository.entity.Empleado;
import com.nttdata.demoweb.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	
	@Autowired
	EmpleadoRepoJPA repoJPA;

	@Override
	public void registrar(String name) {
		repoJPA.registrar(name);
		
	}

	@Override
	public List<Empleado> listar() {
		return repoJPA.findAll();
	}

	@Override
	public List<Empleado> listarFiltroNombre(String cad) {
		return repoJPA.listarCuyoNombreContiene(cad);
	}

	@Override
	public List<Empleado> listarConJPA(Integer pId, String contiene) {
		return repoJPA.findByIdGreaterThanAndNombreLike(pId, contiene);
	}
	
	

	@Override
	public List<Empleado> listarFiltroNombreEs(String cad) {
		return repoJPA.listarCuyoNombreEs(cad);
	}
	
	

}
