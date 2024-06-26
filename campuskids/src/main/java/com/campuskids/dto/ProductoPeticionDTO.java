package com.campuskids.dto;

import com.campuskids.entidad.Imagen;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductoPeticionDTO {
    private String nombre;
    private String descripcion;
    private long idCategoria;
    private List<Imagen> imagenes;

}
