package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cao_salario")
public class CaoSalario {
    @EmbeddedId
    private CaoSalarioId id;

    @Column(name = "brut_salario", nullable = false)
    private Float brutSalario;

    @Column(name = "liq_salario", nullable = false)
    private Float liqSalario;

}