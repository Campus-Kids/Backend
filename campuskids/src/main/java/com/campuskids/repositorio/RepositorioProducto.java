package com.campuskids.repositorio;

import com.campuskids.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Long> {
    boolean existsByNombre(String nombre);
    List<Producto> findByNombreContainingOrCategoriaNombreContainingOrDescripcionContaining(String nombre, String categoriaNombre, String descripcion);
}
