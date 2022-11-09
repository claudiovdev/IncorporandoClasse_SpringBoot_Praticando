package com.api.incorporandoclasse.mapper;

import com.api.incorporandoclasse.Dtos.UsuarioDto;
import com.api.incorporandoclasse.models.UsuarioModel;

public interface UsuarioMapper {

    UsuarioModel toUsuarioModel(UsuarioDto userDto);
}
