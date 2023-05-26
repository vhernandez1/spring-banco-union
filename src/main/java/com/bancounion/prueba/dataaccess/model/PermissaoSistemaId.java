package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PermissaoSistemaId implements Serializable {
    private static final long serialVersionUID = 6113276471156988864L;
    @Column(name = "co_usuario", nullable = false, length = 20)
    private String coUsuario;

    @Column(name = "co_tipo_usuario", nullable = false)
    private Long coTipoUsuario;

    @Column(name = "co_sistema", nullable = false)
    private Long coSistema;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PermissaoSistemaId entity = (PermissaoSistemaId) o;
        return Objects.equals(this.coSistema, entity.coSistema) &&
                Objects.equals(this.coTipoUsuario, entity.coTipoUsuario) &&
                Objects.equals(this.coUsuario, entity.coUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coSistema, coTipoUsuario, coUsuario);
    }

}