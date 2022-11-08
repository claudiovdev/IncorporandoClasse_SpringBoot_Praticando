package com.api.incorporandoclasse.repositories;

import com.api.incorporandoclasse.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

}
