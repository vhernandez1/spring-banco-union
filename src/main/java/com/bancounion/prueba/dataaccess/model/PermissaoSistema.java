package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "permissao_sistema")
public class PermissaoSistema {


    @EmbeddedId
    private PermissaoSistemaId id;

    @Column(name = "in_ativo", nullable = false)
    private Character inAtivo;

    @Column(name = "co_usuario_atualizacao", length = 20)
    private String coUsuarioAtualizacao;

    @Column(name = "dt_atualizacao", nullable = false)
    private Instant dtAtualizacao;

}