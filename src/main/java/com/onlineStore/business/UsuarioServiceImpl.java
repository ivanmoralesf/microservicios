package com.onlineStore.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineStore.domain.Usuario;
import com.onlineStore.repository.UsuarioRepository;
import com.onlineStore.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	public Optional<Usuario> findOne(String id){
		return usuarioRepository.findById(id);
	}
	@Override
	public Long numeroDeRegistros() {
		// TODO Auto-generated method stub
		return usuarioRepository.count();
	}
	
	public void deleteUser(String id) {
		usuarioRepository.deleteById(id);
		
	}
	@Override
	public void addUser(Usuario user) {
		usuarioRepository.insert(user);

	}
	@Override
	public void updateUser(Usuario user) {
		usuarioRepository.save(user);
		
	}

}
