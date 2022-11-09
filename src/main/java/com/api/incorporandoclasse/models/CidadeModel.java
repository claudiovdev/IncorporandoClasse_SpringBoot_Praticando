package com.api.incorporandoclasse.models;

import javax.persistence.*;

@Entity
@Table(name = "TB_CIDADE")
public class CidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;


}
