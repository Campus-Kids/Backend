package com.campuskids.repositorio;

import com.campuskids.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Long> {
    boolean existsByNombre(String nombre);

}
