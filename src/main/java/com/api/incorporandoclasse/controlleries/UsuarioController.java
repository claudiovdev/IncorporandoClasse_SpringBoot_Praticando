package com.api.incorporandoclasse.controlleries;

import com.api.incorporandoclasse.Dtos.UsuarioDto;
import com.api.incorporandoclasse.mapper.UsuarioMapper;
import com.api.incorporandoclasse.models.UsuarioModel;
import com.api.incorporandoclasse.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioMapper mapper;

    @Autowired
    UsuarioService service;

    public ResponseEntity<Object> cadastrarUsuario(@RequestBody UsuarioDto userDto){
        UsuarioModel usuario = mapper.toUsuarioModel(userDto);
        usuario = service.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }
}
