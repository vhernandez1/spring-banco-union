package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "cao_usuario")
public class CaoUsuario {
    @Id
    @Column(name = "co_usuario", nullable = false, length = 20)
    private String id;

    @Column(name = "no_usuario", nullable = false, length = 50)
    private String noUsuario;

    @Column(name = "ds_senha", nullable = false, length = 14)
    private String dsSenha;

    @Column(name = "co_usuario_autorizacao", length = 20)
    private String coUsuarioAutorizacao;

    @Column(name = "nu_matricula")
    private Long nuMatricula;

    @Column(name = "dt_nascimento")
    private LocalDate dtNascimento;

    @Column(name = "dt_admissao_empresa")
    private LocalDate dtAdmissaoEmpresa;

    @Column(name = "dt_desligamento")
    private LocalDate dtDesligamento;

    @Column(name = "dt_inclusao")
    private Instant dtInclusao;

    @Column(name = "dt_expiracao")
    private LocalDate dtExpiracao;

    @Column(name = "nu_cpf", length = 14)
    private String nuCpf;

    @Column(name = "nu_rg", length = 20)
    private String nuRg;

    @Column(name = "no_orgao_emissor", length = 10)
    private String noOrgaoEmissor;

    @Column(name = "uf_orgao_emissor", length = 2)
    private String ufOrgaoEmissor;

    @Column(name = "ds_endereco", length = 150)
    private String dsEndereco;

    @Column(name = "no_email", length = 100)
    private String noEmail;

    @Column(name = "no_email_pessoal", length = 100)
    private String noEmailPessoal;

    @Column(name = "nu_telefone", length = 64)
    private String nuTelefone;

    @Column(name = "dt_alteracao", nullable = false)
    private Instant dtAlteracao;

    @Column(name = "url_foto")
    private String urlFoto;

    @Column(name = "instant_messenger", length = 80)
    private String instantMessenger;

    @Column(name = "icq", columnDefinition = "INT UNSIGNED")
    private Long icq;

    @Column(name = "msn", length = 50)
    private String msn;

    @Column(name = "yms", length = 50)
    private String yms;

    @Column(name = "ds_comp_end", length = 50)
    private String dsCompEnd;

    @Column(name = "ds_bairro", length = 30)
    private String dsBairro;

    @Column(name = "nu_cep", length = 10)
    private String nuCep;

    @Column(name = "no_cidade", length = 50)
    private String noCidade;

    @Column(name = "uf_cidade", length = 2)
    private String ufCidade;

    @Column(name = "dt_expedicao")
    private LocalDate dtExpedicao;

}