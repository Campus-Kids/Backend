package com.campuskids.repositorio;

import com.campuskids.entidad.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RespositorioCategoria extends JpaRepository<Categoria, Long> {
    boolean existsByNombre(String nombre);

}
