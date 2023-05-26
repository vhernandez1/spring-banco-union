package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "cao_fatura")
public class CaoFatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_fatura", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @Column(name = "co_cliente", nullable = false)
    private Integer coCliente;

    @Column(name = "co_sistema", nullable = false)
    private Integer coSistema;

    @Column(name = "co_os", nullable = false)
    private Integer coOs;

    @Column(name = "num_nf", nullable = false)
    private Integer numNf;

    @Column(name = "total", nullable = false)
    private Float total;

    @Column(name = "valor", nullable = false)
    private Float valor;

    @Column(name = "data_emissao", nullable = false)
    private LocalDate dataEmissao;

    @Lob
    @Column(name = "corpo_nf", nullable = false)
    private String corpoNf;

    @Column(name = "comissao_cn", nullable = false)
    private Float comissaoCn;

    @Column(name = "total_imp_inc", nullable = false)
    private Float totalImpInc;

}