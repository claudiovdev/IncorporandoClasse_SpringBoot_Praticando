package com.api.incorporandoclasse.controlleries;

import com.api.incorporandoclasse.Dtos.UsuarioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    public ResponseEntity<Object> cadastrarUsuario(@RequestBody UsuarioDto userDto){

        return null;
    }
}
