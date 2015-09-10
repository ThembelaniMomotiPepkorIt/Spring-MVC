package za.ac.pgdswd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import za.ac.pgdswd.models.Student;

@Controller
public class StudentAdmissionController {
		
	//All objects in this method are injected into all other handler methods
	//Spring MVC always makes a call to this method first
	@ModelAttribute
	public void addcommonObject(Model model){
		model.addAttribute("headerMsg", "Welcome to the University of the Western Cape");
	}
	
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionFrom(){
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}
	
	//student is automatically bound to view so it can be 
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1){
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg", "Details submitted to you");
		return null;
	}
	
	/*@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="anonymous")String name, @RequestParam("hobby") String hobby){
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg", "Details submitted to you: "+name+" Hobby: "+hobby);
		return null;
	}*/

}

