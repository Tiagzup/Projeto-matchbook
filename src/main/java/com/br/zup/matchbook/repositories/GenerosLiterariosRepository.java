package com.br.zup.matchbook.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.matchbook.models.GenerosLiterarios;

@Repository
public interface GenerosLiterariosRepository extends CrudRepository<GenerosLiterarios, Integer> {

}
