package com.AppEvento.repositories;

import org.springframework.data.repository.CrudRepository;

import com.AppEvento.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

	 Evento findByCodigo(long codigo);

}
