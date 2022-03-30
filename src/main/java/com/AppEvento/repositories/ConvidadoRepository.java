package com.AppEvento.repositories;

import org.springframework.data.repository.CrudRepository;

import com.AppEvento.models.Convidado;
import com.AppEvento.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);

}
