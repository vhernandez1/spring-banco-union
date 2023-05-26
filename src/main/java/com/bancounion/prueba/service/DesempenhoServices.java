package com.bancounion.prueba.service;

import com.bancounion.prueba.dataaccess.dto.CaoClienteDto;
import com.bancounion.prueba.dataaccess.dto.CaoDesempehoDto;
import com.bancounion.prueba.dataaccess.dto.CaoDesempenhoTotal;
import com.bancounion.prueba.dataaccess.dto.CaoUsuarioDto;
import com.bancounion.prueba.dataaccess.repository.CaoFaturaRepository;
import com.bancounion.prueba.dataaccess.repository.CaoUsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class DesempenhoServices {

  public static final long CO_SISTEMA = 1L;
  public static final char IN_ACTIVO = 'S';

  private final CaoUsuarioRepository caoUsuarioRepository;
  private final CaoFaturaRepository caoFaturaRepository;


  public DesempenhoServices(CaoUsuarioRepository caoUsuarioRepository, CaoFaturaRepository caoFaturaRepository) {
    this.caoUsuarioRepository = caoUsuarioRepository;
    this.caoFaturaRepository = caoFaturaRepository;
  }

  public List<CaoUsuarioDto> getConsultores() {
    List<Long> coTipoUsuarios = Arrays.asList(0L, 1L, 2L);
    List<CaoUsuarioDto> caoUsuarios = caoUsuarioRepository.FindActiveUsers(CO_SISTEMA, Character.valueOf(IN_ACTIVO), coTipoUsuarios);
    log.info("consultores =>", caoUsuarios);
    return caoUsuarios;

  }

  public List<CaoClienteDto> getClientesbyConsultor(String idConsultor) {
    return caoFaturaRepository.findClientesByConsultor(idConsultor);
  }

  public List<CaoDesempehoDto> getDesempenhoByClienteAndConsultor(String idConsultor, String idCliente) {
    return caoFaturaRepository.findDesempenoByUsuarioAndConsultor(idConsultor, idCliente);
  }

  public List<CaoDesempehoDto> getDesempenhoByConsultor(String idConsultor) {
    return caoFaturaRepository.findDesempenoByConsultor(idConsultor);
  }


}
