package com.campuskids.controlador;

import com.campuskids.dto.ProductoPeticionDTO;
import com.campuskids.dto.ProductoRespuestaDTO;
import com.campuskids.servicio.ServicioProducto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ControladorProducto {
    private ServicioProducto servicioProducto;
    public ControladorProducto(ServicioProducto servicioProducto) {
        this.servicioProducto = servicioProducto;
    }

    @PostMapping
    public ResponseEntity<ProductoRespuestaDTO> registrarProducto(@RequestBody ProductoPeticionDTO producto){
        return ResponseEntity.ok(servicioProducto.registrarProducto(producto));
    }

    @GetMapping
    public ResponseEntity<List<ProductoRespuestaDTO>> buscarProducto(){
        return ResponseEntity.ok().body(servicioProducto.buscarProductos());
    }
    @GetMapping("/{id-producto}")
    public ResponseEntity<ProductoRespuestaDTO> buscarProductoPorId(@PathVariable("id-producto") long id){
        return ResponseEntity.ok().body(servicioProducto.buscarProductoPorId(id));
    }
    @GetMapping("/buscar")
    public ResponseEntity<List<ProductoRespuestaDTO>> buscarProductoPorTextoClave(@RequestParam("texto") String texto){
        return ResponseEntity.ok().body(servicioProducto.buscarProductosPorTexto(texto));
    }

    @PutMapping("/{id-producto}")
    public ResponseEntity<String> actualizarProducto(@PathVariable("id-producto") long id, @RequestBody ProductoPeticionDTO producto){
        return ResponseEntity.ok().body(servicioProducto.actualizarProducto(id, producto));
    }
    @DeleteMapping("/{id-producto}")
    public ResponseEntity<String> eliminarProducto(@PathVariable("id-producto") long id){
        return ResponseEntity.ok().body(servicioProducto.eliminarProducto(id));
    }

}
