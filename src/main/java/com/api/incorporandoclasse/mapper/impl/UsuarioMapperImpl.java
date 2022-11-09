package com.api.incorporandoclasse.mapper.impl;

import com.api.incorporandoclasse.dtos.UsuarioDto;
import com.api.incorporandoclasse.mapper.UsuarioMapper;
import com.api.incorporandoclasse.models.UsuarioModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioModel toUsuarioModel(UsuarioDto userDto) {
        UsuarioModel usuario = new UsuarioModel();
        BeanUtils.copyProperties(userDto, usuario);
        return usuario;
    }
}
