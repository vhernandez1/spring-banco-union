package com.bancounion.prueba.dataaccess.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * A DTO for the {@link com.bancounion.prueba.dataaccess.model.CaoCliente} entity
 */
@Getter
@Setter
@AllArgsConstructor
public class CaoClienteDto implements Serializable {
    private  Long id;
    private  String noFantasia;
}