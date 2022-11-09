package com.api.incorporandoclasse.services.Impl;

import com.api.incorporandoclasse.enums.StatusDoUsuario;
import com.api.incorporandoclasse.models.UsuarioModel;
import com.api.incorporandoclasse.repositories.UsuarioRepository;
import com.api.incorporandoclasse.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public UsuarioModel salvar(UsuarioModel usuario) {
        usuario.setDataDeCriacao(LocalDateTime.now());
        usuario.setDataDeAtualizacao(LocalDateTime.now());
        usuario.setStatus(StatusDoUsuario.ATIVO);
        return repository.save(usuario);
    }

    @Override
    public List<UsuarioModel> listar() {
        return repository.findAll();
    }


}
