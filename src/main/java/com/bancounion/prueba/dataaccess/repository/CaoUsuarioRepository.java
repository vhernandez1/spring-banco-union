package com.bancounion.prueba.dataaccess.repository;

import com.bancounion.prueba.dataaccess.dto.CaoUsuarioDto;
import com.bancounion.prueba.dataaccess.model.CaoUsuario;
import com.bancounion.prueba.dataaccess.model.PermissaoSistema;
import com.bancounion.prueba.dataaccess.model.PermissaoSistemaId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface CaoUsuarioRepository extends CrudRepository<CaoUsuario, String> {
    @Query("""
            select new com.bancounion.prueba.dataaccess.dto.CaoUsuarioDto(c.id , c.noUsuario )  from CaoUsuario c
            join PermissaoSistema p on p.id.coUsuario = c.id
            where p.id.coSistema = :coSistema and p.inAtivo = :inAtivo and p.id.coTipoUsuario in :coTipoUsuarios""")
    List<CaoUsuarioDto> FindActiveUsers(@Param("coSistema") Long coSistema,
                                        @Param("inAtivo") Character inAtivo,
                                        @Param("coTipoUsuarios") Collection<Long> coTipoUsuarios);
}