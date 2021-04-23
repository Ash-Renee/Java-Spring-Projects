package com.ashley.language.controllers;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashley.language.models.Language;
import com.ashley.language.services.LanguageService;

@Controller
public class HomeController {

	private LanguageService langServ;
	
	public HomeController(LanguageService langServ) {
		this.langServ = langServ;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newLanguage", new Language()); // binds to form helper in index.jsp
		model.addAttribute("allLanguages", langServ.getAll()); // displays all languages
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String create(@Valid @ModelAttribute("newLanguage") Language newLanguage, 
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			// still display languages if validation error
			model.addAttribute("allLanguages", langServ.getAll()); 
			return "index.jsp";
		}
		// otherwise create a language and redirect to the show page
		Language language = langServ.create(newLanguage);
		return "redirect:/show/" + language.getId();
	}
	
    @RequestMapping("/show/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
    	Language language = langServ.findLanguage(id);
    	model.addAttribute("language", language);
    	if(language == null) {
    		System.out.println("id does not exist");
    		return "redirect:/";
    	}
    	return "ShowLanguage.jsp";
    }

	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		langServ.deleteLanguage(id);
		return "redirect:/";
	}
	
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Language language = langServ.findLanguage(id);
    	model.addAttribute("changedLanguage", language);
    	return "edit.jsp";
    }
	
	@PostMapping("/languages/update")
	public String update(@Valid @ModelAttribute("changedLanguage") Language changedLanguage, 
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			// still display languages if validation error
			model.addAttribute("allLanguages", langServ.getAll()); 
			return "edit.jsp";
		}
		else {
			langServ.updateLanguage(changedLanguage);
		
			return "redirect:/";
		}

	}
	
}