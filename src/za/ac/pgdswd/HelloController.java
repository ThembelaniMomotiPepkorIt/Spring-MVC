package za.ac.pgdswd;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("greeting")
public class HelloController {

	@RequestMapping("/welcome/{country}/{lang}")
	public ModelAndView helloWorldEng(@PathVariable Map<String, String> pathVar) {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeGreeting",
				"Hello,This is live from "  + pathVar.get("country")+ " in "+pathVar.get("lang"));

		return modelAndView;
	}
	
}
