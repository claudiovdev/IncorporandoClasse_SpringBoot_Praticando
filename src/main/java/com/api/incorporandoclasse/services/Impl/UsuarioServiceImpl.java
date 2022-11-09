package com.api.incorporandoclasse.services.Impl;

import com.api.incorporandoclasse.models.UsuarioModel;
import com.api.incorporandoclasse.repositories.UsuarioRepository;
import com.api.incorporandoclasse.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public UsuarioModel salvar(UsuarioModel usuario) {
        return repository.save(usuario);
    }
}
