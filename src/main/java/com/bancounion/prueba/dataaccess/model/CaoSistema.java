package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "cao_sistema")
public class CaoSistema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_sistema", nullable = false)
    private Integer id;

    @Column(name = "co_cliente", columnDefinition = "INT UNSIGNED")
    private Long coCliente;

    @Column(name = "co_usuario", length = 50)
    private String coUsuario;

    @Column(name = "co_arquitetura", columnDefinition = "INT UNSIGNED")
    private Long coArquitetura;

    @Column(name = "no_sistema", length = 200)
    private String noSistema;

    @Lob
    @Column(name = "ds_sistema_resumo")
    private String dsSistemaResumo;

    @Lob
    @Column(name = "ds_caracteristica")
    private String dsCaracteristica;

    @Lob
    @Column(name = "ds_requisito")
    private String dsRequisito;

    @Column(name = "no_diretoria_solic", length = 100)
    private String noDiretoriaSolic;

    @Column(name = "ddd_telefone_solic", length = 5)
    private String dddTelefoneSolic;

    @Column(name = "nu_telefone_solic", length = 20)
    private String nuTelefoneSolic;

    @Column(name = "no_usuario_solic", length = 100)
    private String noUsuarioSolic;

    @Column(name = "dt_solicitacao")
    private LocalDate dtSolicitacao;

    @Column(name = "dt_entrega")
    private LocalDate dtEntrega;

    @Column(name = "co_email")
    private Integer coEmail;

}