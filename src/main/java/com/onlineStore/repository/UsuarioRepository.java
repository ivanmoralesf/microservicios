package com.onlineStore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.onlineStore.domain.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
