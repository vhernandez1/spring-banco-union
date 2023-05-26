package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "cao_os")
public class CaoOs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_os", nullable = false)
    private Integer id;

    @Column(name = "nu_os")
    private Integer nuOs;

    @Column(name = "co_sistema")
    private Integer coSistema;

    @Column(name = "co_usuario", length = 50)
    private String coUsuario;

    @Column(name = "co_arquitetura")
    private Integer coArquitetura;

    @Column(name = "ds_os", length = 200)
    private String dsOs;

    @Column(name = "ds_caracteristica", length = 200)
    private String dsCaracteristica;

    @Column(name = "ds_requisito", length = 200)
    private String dsRequisito;

    @Column(name = "dt_inicio")
    private LocalDate dtInicio;

    @Column(name = "dt_fim")
    private LocalDate dtFim;

    @Column(name = "co_status")
    private Integer coStatus;

    @Column(name = "diretoria_sol", length = 50)
    private String diretoriaSol;

    @Column(name = "dt_sol")
    private LocalDate dtSol;

    @Column(name = "nu_tel_sol", length = 20)
    private String nuTelSol;

    @Column(name = "ddd_tel_sol", length = 5)
    private String dddTelSol;

    @Column(name = "nu_tel_sol2", length = 20)
    private String nuTelSol2;

    @Column(name = "ddd_tel_sol2", length = 5)
    private String dddTelSol2;

    @Column(name = "usuario_sol", length = 50)
    private String usuarioSol;

    @Column(name = "dt_imp")
    private LocalDate dtImp;

    @Column(name = "dt_garantia")
    private LocalDate dtGarantia;

    @Column(name = "co_email")
    private Integer coEmail;

    @Column(name = "co_os_prospect_rel")
    private Integer coOsProspectRel;

}