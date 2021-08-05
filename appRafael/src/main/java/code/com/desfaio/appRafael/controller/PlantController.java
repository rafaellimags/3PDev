package code.com.desfaio.appRafael.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlantController {
	@GetMapping(value = "/")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping(value = "/plant/list") 
	String list(Model model) {
		List<String> plantsList = new ArrayList<String>();
				
		plantsList.add("Jiboia");
		plantsList.add("Agapanto");
		plantsList.add("Alisso");
		
		model.addAttribute("plants", plantsList);
		
		return "plant/list";
	}
}
