package za.ac.pgdswd.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import za.ac.pgdswd.customeditors.StudentNameEditor;
import za.ac.pgdswd.models.Student;

@Controller
public class StudentAdmissionController {
	
	//Spring uses editors to perform tight conversions when binding data
	//Editor Classes intercept the binding to the model layer
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[] {"CellPhone"});
		SimpleDateFormat formatter = new SimpleDateFormat("DD***MM***YYYY");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(formatter, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
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
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		return modelAndView;
	}
	
}

