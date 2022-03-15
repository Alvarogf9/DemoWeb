package com.nttdata.demoweb.service;

import java.util.List;

import com.nttdata.demoweb.repository.entity.Empleado;

public interface EmpleadoService {
	
	public void registrar(String nombre);
	public List<Empleado> listar();
	public List<Empleado> listarFiltroNombre(String cad);
	List<Empleado> listarConJPA(Integer pId,String contiene);
	List<Empleado> listarFiltroNombreEs(String cad);
	public Empleado inserta(Empleado emp);
	public Empleado modificar(Empleado emp);
	public void eliminarEmpleado(Integer id);
	public Empleado getById(Integer id);
	
	
}
