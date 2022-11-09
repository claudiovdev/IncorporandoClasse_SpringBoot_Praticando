package com.api.incorporandoclasse.Dtos;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UsuarioDto {

    private String login;
    private String nome;
    private String email;
}
