package org.sid.controller;


import org.sid.data.AdminDAO;
import org.sid.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class adminController {

	@Autowired
	private AdminDAO adminDAO;
	
	@GetMapping("/admin")
	public String showAdmin(Model model) {

		
		model.addAttribute("dmdlist", adminDAO.findAll());
		model.addAttribute("messadm", new Admin());
		return "adminpage";
	}

	@PostMapping("/admin")

		public String getAdmin(@ModelAttribute Admin newadmin) {
		Admin adm = new Admin(newadmin.getEmail(),newadmin.getMotdepasse());
		adminDAO.save(adm);
		return "redirect:demande";
		
		
	}

	


}
