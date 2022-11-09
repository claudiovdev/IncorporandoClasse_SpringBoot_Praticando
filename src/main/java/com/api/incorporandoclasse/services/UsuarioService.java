package com.api.incorporandoclasse.services;

import com.api.incorporandoclasse.models.UsuarioModel;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    UsuarioModel salvar(UsuarioModel usuario);


    List<UsuarioModel> listar();
}
