package com.bancounion.prueba.dataaccess.repository;

import com.bancounion.prueba.dataaccess.dto.CaoClienteDto;
import com.bancounion.prueba.dataaccess.dto.CaoDesempehoDto;
import com.bancounion.prueba.dataaccess.dto.CaoDesempenhoTotal;
import com.bancounion.prueba.dataaccess.dto.CaoUsuarioDto;
import com.bancounion.prueba.dataaccess.model.CaoCliente;
import com.bancounion.prueba.dataaccess.model.CaoFatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CaoFaturaRepository extends CrudRepository<CaoFatura, Long> {

    @Query("""
            select new com.bancounion.prueba.dataaccess.dto.CaoClienteDto(c.id,c.noFantasia)   from CaoFatura f
            join CaoCliente c on f.coCliente=c.id
            join CaoSistema cs on f.coSistema=cs.id
            where cs.coUsuario = :usuario
            group by c.id,c.noFantasia
            order by c.noFantasia""")
    List<CaoClienteDto> findClientesByConsultor(@Param("usuario") String usuario);


    @Query("""
            select new com.bancounion.prueba.dataaccess.dto.CaoDesempehoDto(s.noSistema,o.dsOs,f.numNf,f.dataEmissao,f.valor,
            f.valor -(f.valor * (f.totalImpInc /100)),
            (f.valor -(f.valor * f.totalImpInc / 100)) * (f.comissaoCn/100),
            (f.valor * f.totalImpInc / 100))  from CaoFatura f
            join CaoCliente c on c.id = f.coCliente
            join CaoSistema s on s.id = f.coSistema
            join CaoOs o on o.id = f.coOs
            where c.id = :cliente
            and s.coUsuario = :consultor""")
    List<CaoDesempehoDto> findDesempenoByUsuarioAndConsultor(@Param("consultor") String consultor,@Param("cliente") String cliente);


  @Query("""
            select new com.bancounion.prueba.dataaccess.dto.CaoDesempehoDto(s.noSistema,o.dsOs,f.numNf,f.dataEmissao,f.valor,
            f.valor -(f.valor * (f.totalImpInc /100)),
            (f.valor -(f.valor * f.totalImpInc / 100)) * (f.comissaoCn/100),
            (f.valor * f.totalImpInc / 100))  from CaoFatura f
            join CaoCliente c on c.id = f.coCliente
            join CaoSistema s on s.id = f.coSistema
            join CaoOs o on o.id = f.coOs
            and s.coUsuario = :consultor""")
  List<CaoDesempehoDto> findDesempenoByConsultor(@Param("consultor") String consultor);


}
