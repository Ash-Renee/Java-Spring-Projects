package com.ashley.language.services;


import java.util.List;

import org.springframework.stereotype.Service;


import com.ashley.language.models.Language;
import com.ashley.language.repositories.LanguageRepository;

@Service
public class LanguageService {

	private LanguageRepository languageRepo;
	
	public LanguageService(LanguageRepository languageRepo) {
		this.languageRepo = languageRepo;
	}
	
	public Language create(Language newLanguage) {
		return languageRepo.save(newLanguage);
	}
	
	public List<Language> getAll() {
		return languageRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		return languageRepo.findById(id).orElse(null);
	}
	
	public void updateLanguage (Language languageToUpdate) {
		languageRepo.save(languageToUpdate);
	}
	
    public void deleteLanguage(Long id) {
    	languageRepo.deleteById(id);
    }
}

