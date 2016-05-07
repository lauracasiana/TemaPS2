package com.theatre.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.theatre.models.Bilet;
import com.theatre.models.TicketManager;

@Controller
@RequestMapping("/bilet")
public class TicketController {

	@RequestMapping(value = { "/veziBilete" }, method = RequestMethod.POST)
	public ModelAndView adaugaSpectacol(
			@ModelAttribute("SpringWeb") TicketManager tm, BindingResult result) {

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("bilet", tm.seeAllTickets());

		return new ModelAndView("/veziBilete", model);

	}

	@RequestMapping(value = { "/adaugaBilet" }, method = RequestMethod.POST)
	public String adaugaBilet(@ModelAttribute("SpringWeb") TicketManager tm,
			Bilet bilet, Model model) {

		model.addAttribute("spectacol", bilet.getSpectacol());
		model.addAttribute("rand", bilet.getRand());
		model.addAttribute("numar", bilet.getNumar());
		tm.addTicket(bilet);
		return "redirect:/angajatPage";
	}
}
