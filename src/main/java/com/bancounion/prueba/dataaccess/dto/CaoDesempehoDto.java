package com.bancounion.prueba.dataaccess.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class CaoDesempehoDto {
    private String noSistema;
    private String os;
    private Integer nf;
    private LocalDate emissao;
    private Float total;
    private Float liquido;
    private Float comissao;
    private Float impuesto;
}
