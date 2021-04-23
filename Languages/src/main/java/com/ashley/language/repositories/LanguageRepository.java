package com.ashley.language.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashley.language.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

	//queries defined here
	List<Language> findAll();


}
