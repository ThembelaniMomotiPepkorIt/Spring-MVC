package za.ac.pgdswd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
  
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionFrom(){
		
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="anonymous")String name, @RequestParam("hobby") String hobby){
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg", "Details submitted to you: "+name+" Hobby: "+hobby);
		return null;
	}
}
