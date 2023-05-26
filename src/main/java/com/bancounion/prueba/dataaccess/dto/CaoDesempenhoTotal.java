package com.bancounion.prueba.dataaccess.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CaoDesempenhoTotal {
  private Float totalSum;
  private Float totalLiquido;
  private Float totalComissao;
}
