package com.br.zup.matchbook.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.matchbook.models.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer>{

	Optional<Login> findByNicknameAndPassword (String nickname, String password);
}
