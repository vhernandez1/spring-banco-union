package com.bancounion.prueba.dataaccess.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CaoSalarioId implements Serializable {
    private static final long serialVersionUID = 1847781228119663785L;
    @Column(name = "co_usuario", nullable = false, length = 20)
    private String coUsuario;

    @Column(name = "dt_alteracao", nullable = false)
    private LocalDate dtAlteracao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CaoSalarioId entity = (CaoSalarioId) o;
        return Objects.equals(this.coUsuario, entity.coUsuario) &&
                Objects.equals(this.dtAlteracao, entity.dtAlteracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coUsuario, dtAlteracao);
    }

}