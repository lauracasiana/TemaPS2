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

import com.theatre.models.User;
import com.theatre.models.UserManager;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String login(UserManager um, User usr, Model model) throws Exception {

		model.addAttribute("username", usr.getUsername());
		model.addAttribute("parola", usr.getParola());
		User u = um.Login(usr.getUsername(), usr.getParola());
		if (u != null) {
			if (u.getRole().equals("admin")) {
				return "redirect:/admin";
			}
			if (u.getRole().equals("angajat")) {
				return "redirect:/angajat";
			}
		} else
			return "redirect:/index";
		return "";
	}

	@RequestMapping(value = { "/resetPassword" }, method = RequestMethod.POST)
	public String changePassword(@ModelAttribute("SpringWeb") UserManager um,
			User usr, Model model) {
		model.addAttribute("username", usr.getUsername());
		model.addAttribute("parola", usr.getParola());
		um.changePassword(usr.getParola(), usr);
		return "redirect:/index";
	}

	@RequestMapping(value = { "/adaugaAng" }, method = RequestMethod.POST)
	public String adaugaAngajat(@ModelAttribute("SpringWeb") UserManager um,
			User usr, Model model) {
		model.addAttribute("username", usr.getUsername());
		model.addAttribute("parola", usr.getParola());
		model.addAttribute("nume", usr.getNume());
		model.addAttribute("role", "angajat");
		um.addAngajat(usr);
		return "redirect:/adminPage";

	}

	@RequestMapping(value = { "/veziAng" }, method = RequestMethod.POST)
	public ModelAndView veziAngajati(@ModelAttribute("SpringWeb") UserManager um,
			BindingResult result) {

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", um.seeAllAngajati());

		return new ModelAndView("/veziAng", model);

	}

}
