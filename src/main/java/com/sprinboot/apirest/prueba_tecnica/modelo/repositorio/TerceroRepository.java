package com.sprinboot.apirest.prueba_tecnica.modelo.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprinboot.apirest.prueba_tecnica.modelo.entidades.TerTercero;

@Repository
public interface TerceroRepository extends JpaRepository<TerTercero, Long>{
	
	Optional<TerTercero> findByTerDocumento(String terDocumento);
}
