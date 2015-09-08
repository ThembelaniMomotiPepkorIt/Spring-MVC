package za.ac.pgdswd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorldEng() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeGreeting",
				"Hello,This is Thembelani's project");

		return modelAndView;
	}
	

	@RequestMapping("/wamkelekile")
	public ModelAndView helloWorldXh() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeGreeting",
				"Hello,This is Thembelani's project");

		return modelAndView;
	}

}
