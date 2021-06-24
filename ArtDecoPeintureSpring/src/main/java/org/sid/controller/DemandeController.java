package org.sid.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemandeController {
//	private List<Devis> messageList = new ArrayList<>();

	
	@GetMapping("/demande")
	public String showDemandee(Model model) {
	
		
		return "demande";
	}

	@PostMapping("/demande")

		public String getDemande() {

		return "redirect:demande";
		
	}




}
