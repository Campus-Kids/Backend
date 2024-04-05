package com.campuskids.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductoRespuestaDTO {
    private long id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private List<String> imagenes;

}
