package com.bancounion.prueba.dataaccess.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * A DTO for the {@link com.bancounion.prueba.dataaccess.model.CaoUsuario} entity
 */
@Getter
@Setter
@AllArgsConstructor
public class CaoUsuarioDto implements Serializable {
    private  String id;
    private  String noUsuario;
}