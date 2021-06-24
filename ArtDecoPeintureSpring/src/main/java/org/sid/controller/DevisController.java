package org.sid.controller;



import org.sid.data.DevisDAO;
import org.sid.model.Devis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DevisController {
//	private List<Devis> messageList = new ArrayList<>();
	@Autowired
	private DevisDAO devisDAO;
	
	@GetMapping("/devis")
	public String showMessage(Model model) {
//		Message msg1=new Message("daniel","bonjours a tous ");
//		messageList.add(msg1);
		
		model.addAttribute("dvslist", devisDAO.findAll());
		model.addAttribute("message", new Devis());
		return "devispage";
	}

	@PostMapping("/devis")
//	public String postMessage(@ModelAttribute Message newMessage) {
		public String getMessage(@ModelAttribute Devis newdevis) {
//		messageList.add(newMessage);
		Devis dvs=new Devis(newdevis.getNom(),newdevis.getPrenom(),newdevis.getTel(),newdevis.getEmail(),newdevis.getMessages());
		devisDAO.save(dvs);
		return "redirect:demande";
		
		
	}




}
