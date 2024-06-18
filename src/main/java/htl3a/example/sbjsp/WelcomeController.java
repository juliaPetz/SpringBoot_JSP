package htl3a.example.sbjsp;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("message", "Hello World!");
		model.addAttribute("date", LocalDateTime.now());	
		return "index";
	}
	
	@GetMapping({"/test"})
	public String testPage(Model model) {
		String message = "Test Text";
		model.addAttribute("testText", message);
		return "test";
	}
	
}
