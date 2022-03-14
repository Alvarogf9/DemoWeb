package com.nttdata.demoweb.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nttdata.demoweb.repository.UsuarioRepoJPA;
import com.nttdata.demoweb.repository.entity.Usuario;
import com.nttdata.demoweb.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService , UserDetailsService{

	@Autowired
	UsuarioRepoJPA usuarioDAO;
	
	@Override
	public List<Usuario> listar() {
		return usuarioDAO.findAll();
	}

	@Override
	public Usuario buscarPorUsername(String username) {
		//return usuarioDAO.getById(username);
		return usuarioDAO.findById(username).get(); //devuelve un optional Usuario y por eso hay que usar el .get u otro metodo que nos interese
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return buscarPorUsername(username);
	}

}
