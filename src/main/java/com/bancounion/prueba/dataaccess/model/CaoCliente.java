package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cao_cliente")
public class CaoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_cliente", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @Column(name = "no_razao", length = 50)
    private String noRazao;

    @Column(name = "no_fantasia", length = 50)
    private String noFantasia;

    @Column(name = "no_contato", length = 30)
    private String noContato;

    @Column(name = "nu_telefone", length = 15)
    private String nuTelefone;

    @Column(name = "nu_ramal", length = 6)
    private String nuRamal;

    @Column(name = "nu_cnpj", length = 18)
    private String nuCnpj;

    @Column(name = "ds_endereco", length = 150)
    private String dsEndereco;

    @Column(name = "nu_numero")
    private Integer nuNumero;

    @Column(name = "ds_complemento", length = 150)
    private String dsComplemento;

    @Column(name = "no_bairro", nullable = false, length = 50)
    private String noBairro;

    @Column(name = "nu_cep", length = 10)
    private String nuCep;

    @Column(name = "no_pais", length = 50)
    private String noPais;

    @Column(name = "co_ramo")
    private Long coRamo;

    @Column(name = "co_cidade", nullable = false)
    private Long coCidade;

    @Column(name = "co_status", columnDefinition = "INT UNSIGNED")
    private Long coStatus;

    @Column(name = "ds_site", length = 50)
    private String dsSite;

    @Column(name = "ds_email", length = 50)
    private String dsEmail;

    @Column(name = "ds_cargo_contato", length = 50)
    private String dsCargoContato;

    @Column(name = "tp_cliente", length = 2)
    private String tpCliente;

    @Column(name = "ds_referencia", length = 100)
    private String dsReferencia;

    @Column(name = "co_complemento_status", columnDefinition = "INT UNSIGNED")
    private Long coComplementoStatus;

    @Column(name = "nu_fax", length = 15)
    private String nuFax;

    @Column(name = "ddd2", length = 10)
    private String ddd2;

    @Column(name = "telefone2", length = 20)
    private String telefone2;

}