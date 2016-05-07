package com.theatre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.theatre.models.Spectacol;
import com.theatre.models.SpectacolManager;

@Controller
@RequestMapping("/spectacol")
public class SpectacolController {

	@RequestMapping(value = { "/adaugaSpectacol" }, method = RequestMethod.POST)
	public String adaugaSpectacol(
			@ModelAttribute("SpringWeb") SpectacolManager sm, Spectacol spec,
			Model model) {

		model.addAttribute("titlu", spec.getTitlu());
		model.addAttribute("regia", spec.getRegia());
		model.addAttribute("distributia", spec.getDistributia());
		model.addAttribute("dataPremierei", spec.getDataPremierei());
		model.addAttribute("nrBilete", spec.getNrBilete());
		sm.addSpectacol(spec);
		return "redirect:/adminPage";
	}

	@RequestMapping(value = { "/modificaSpectacol" }, method = RequestMethod.POST)
	public String modificaSpectacol(
			@ModelAttribute("SpringWeb") SpectacolManager sm, Spectacol spec,
			Model model) {

		model.addAttribute("titlu", spec.getTitlu());
		model.addAttribute("regia", spec.getRegia());
		model.addAttribute("distributia", spec.getDistributia());
		model.addAttribute("dataPremierei", spec.getDataPremierei());
		model.addAttribute("nrBilete", spec.getNrBilete());
		sm.updateSpectacol(spec);
		return "redirect:/adminPage";

	}

	@RequestMapping(value = { "/stergeSpectacol" }, method = RequestMethod.POST)
	public String stergeSpectacol(
			@ModelAttribute("SpringWeb") SpectacolManager sm, Spectacol spec,
			Model model) {

		model.addAttribute("titlu", spec.getTitlu());
		model.addAttribute("regia", spec.getRegia());
		model.addAttribute("distributia", spec.getDistributia());
		model.addAttribute("dataPremierei", spec.getDataPremierei());
		model.addAttribute("nrBilete", spec.getNrBilete());
		sm.deleteSpectacol(spec);
		return "redirect:/adminPage";
	}
}
