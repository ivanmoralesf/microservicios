package com.onlineStore.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineStore.domain.Usuario;
import com.onlineStore.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/public/v1/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> retriveAllUsers() {
		return usuarioService.findAll();
	}
	
	@GetMapping ("/id/{id}")
	public Optional<Usuario> retrieveOneUser(@PathVariable String id){
		return usuarioService.findOne(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteUser(@PathVariable String id) {
		usuarioService.deleteUser(id); 
		return "Usuario "+id+ "eliminado";
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario addUser(@RequestBody Usuario user) {
		usuarioService.addUser(user);
		return user;
	}
	
	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario updateUser(@RequestBody Usuario user) {
		usuarioService.updateUser(user);
		return user;
	}
	
	@PatchMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario patchUser(@RequestBody Usuario user) {
		usuarioService.updateUser(user);
		return user;
	}
	
	
//	public String retrieveOneUser(@PathVariable String id){
//		return id;
//	}
	
	@GetMapping ("/regs")
	public Long countUsers() {
		return usuarioService.numeroDeRegistros();
	}
	
}
