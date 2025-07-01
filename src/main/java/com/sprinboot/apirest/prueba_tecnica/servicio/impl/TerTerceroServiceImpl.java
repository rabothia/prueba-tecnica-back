package com.sprinboot.apirest.prueba_tecnica.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprinboot.apirest.prueba_tecnica.dto.TerTerceroDto;
import com.sprinboot.apirest.prueba_tecnica.modelo.entidades.TerTercero;
import com.sprinboot.apirest.prueba_tecnica.modelo.excepciones.TerceroNotFoundException;
import com.sprinboot.apirest.prueba_tecnica.modelo.repositorio.TerceroRepository;
import com.sprinboot.apirest.prueba_tecnica.servicio.TerTerceroService;

@Service
public class TerTerceroServiceImpl implements TerTerceroService{
	
	@Autowired
	private TerceroRepository terceroRepository;

	@Override
	public TerTerceroDto findByDocumento(String documento) {
		TerTercero tercerodb = terceroRepository.findByTerDocumento(documento)
				.orElseThrow(() -> new TerceroNotFoundException(documento));
		return new TerTerceroDto(tercerodb);
	}

	@Override
	public TerTerceroDto editar(Long id, TerTerceroDto terRecibido) {
		TerTercero tercerodb = terceroRepository.findById(id)
				.orElseThrow(() -> new TerceroNotFoundException(terRecibido.getTerDocumento()));
		
		tercerodb.setTerApellido(terRecibido.getTerApellido());
		tercerodb.setTerNombre(terRecibido.getTerNombre());
		tercerodb.setTerTelcelular(terRecibido.getTerTelcelular());
		tercerodb.setTerCorreo(terRecibido.getTerCorreo());
		
		terceroRepository.save(tercerodb);
		
		return new TerTerceroDto(tercerodb);
		
	}


}
