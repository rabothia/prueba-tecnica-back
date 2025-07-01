package com.sprinboot.apirest.prueba_tecnica.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinboot.apirest.prueba_tecnica.dto.TerTerceroDto;
import com.sprinboot.apirest.prueba_tecnica.servicio.TerTerceroService;

@RestController
@RequestMapping("/tercero")
public class TerTerceroController {
	
	@Autowired
	private TerTerceroService terceroService;

	/**
     * Controller para buscar un tercero
     * @param Documento, Documento del tercero
     * @return terceroDto
     */
    @GetMapping("/buscar/{documento}")
    public ResponseEntity<TerTerceroDto> getTercero(@PathVariable String documento){
    	TerTerceroDto terceroResponse = terceroService.findByDocumento(documento);
    	return ResponseEntity.ok(terceroResponse);
    }
    

    /**
     * Controlador para editar un tercero
     * @param tercero datos tercero
     * @param id id tercero
     * @return Recurso editado con exito
     */
      @PutMapping("/editar/{id}")
      public ResponseEntity<TerTerceroDto> editar(
    		  @RequestBody TerTerceroDto terRecibido, 
    		  @PathVariable("id") Long id) {
    	  
    	  return ResponseEntity.ok(terceroService.editar(id,terRecibido));
      }
}

