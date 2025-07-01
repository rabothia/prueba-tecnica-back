package com.sprinboot.apirest.prueba_tecnica.servicio;

import com.sprinboot.apirest.prueba_tecnica.dto.TerTerceroDto;

public interface TerTerceroService {

	TerTerceroDto findByDocumento (String nit);
	TerTerceroDto editar(Long id, TerTerceroDto terRecibido);
}
