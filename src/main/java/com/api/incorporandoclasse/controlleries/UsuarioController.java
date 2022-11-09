package com.api.incorporandoclasse.controlleries;

import com.api.incorporandoclasse.dtos.UsuarioDto;
import com.api.incorporandoclasse.mapper.UsuarioMapper;
import com.api.incorporandoclasse.models.UsuarioModel;
import com.api.incorporandoclasse.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioMapper mapper;

    @Autowired
    UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody UsuarioDto userDto){
        UsuarioModel usuario = mapper.toUsuarioModel(userDto);
        usuario = service.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> listarUsuarios(){
        List<UsuarioModel> listaDeUsuarios = service.listar();
        if(listaDeUsuarios.isEmpty()){
            ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não existe nenhum usuário cadastrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(listaDeUsuarios);
    }
}
