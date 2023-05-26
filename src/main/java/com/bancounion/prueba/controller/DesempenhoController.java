package com.bancounion.prueba.controller;

import com.bancounion.prueba.dataaccess.dto.CaoClienteDto;
import com.bancounion.prueba.dataaccess.dto.CaoDesempehoDto;
import com.bancounion.prueba.dataaccess.dto.CaoDesempenhoTotal;
import com.bancounion.prueba.dataaccess.dto.CaoUsuarioDto;
import com.bancounion.prueba.service.DesempenhoServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/consultores")
@Slf4j
public class DesempenhoController {

    private final DesempenhoServices desempenhoServices;

    public DesempenhoController(DesempenhoServices desempenhoServices) {
        this.desempenhoServices = desempenhoServices;
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<CaoUsuarioDto>> getConsultores() {
        return new ResponseEntity<>(desempenhoServices.getConsultores(), HttpStatus.OK);
    }


    @CrossOrigin
    @GetMapping("/{idConsultor}/clientes")
    public ResponseEntity<List<CaoClienteDto>> getClientesByConsultor(@PathVariable("idConsultor") String idConsultor) {
        return new ResponseEntity<>(desempenhoServices.getClientesbyConsultor(idConsultor) ,HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/{idConsultor}/clientes/{idCliente}")
    public ResponseEntity<List<CaoDesempehoDto>> getDesempenoByConsultorAndCliente(@PathVariable("idConsultor") String idConsultor,
                                                                       @PathVariable("idCliente") String idCliente) {
        return new ResponseEntity<>(desempenhoServices.getDesempenhoByClienteAndConsultor(idConsultor,idCliente) ,HttpStatus.OK);
    }

  @CrossOrigin
  @GetMapping("/{idConsultor}")
  public ResponseEntity<List<CaoDesempehoDto>> getDesempenoByConsultor(@PathVariable("idConsultor") String idConsultor) {
    return new ResponseEntity<>(desempenhoServices.getDesempenhoByConsultor(idConsultor) ,HttpStatus.OK);
  }



}
