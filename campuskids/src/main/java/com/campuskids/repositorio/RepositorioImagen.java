package com.campuskids.repositorio;

import com.campuskids.entidad.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioImagen extends JpaRepository<Imagen, Long> {
    List<Imagen> findImagensByProductoId(Long id);

}
