package com.onlineStore.service;

import java.util.List;
import java.util.Optional;

import com.onlineStore.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> findAll();
	
	public Optional<Usuario> findOne(String id);
	
	public Long numeroDeRegistros();
	
	public void deleteUser(String id);
	
	public void addUser(Usuario user);
	
	public void updateUser(Usuario user);

}
