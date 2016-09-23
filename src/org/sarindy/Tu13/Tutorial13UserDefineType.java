package org.sarindy.Tu13;



import javax.validation.Valid;

import org.sarindy.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tutorial13UserDefineType {
	
	@ModelAttribute
	public void addingCommonObject(Model model1){
	
		model1.addAttribute("msg1","សូមស្វាគមន៏ការមកដល់របស់លោកអ្នក");//This means all the msg1 jsp has all this text/object
	}

	@RequestMapping(value = "/AdmissionFormTu13.html", method = RequestMethod.GET)
	public ModelAndView getAdmission() {
		ModelAndView model = new ModelAndView("AdmissionFormTu13");
		return model;
	}
	
	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public ModelAndView getSignon() {
		ModelAndView model = new ModelAndView("signon");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionFormTu13.html",method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormModelAtt(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult){
		
		/*-- Student student = new Student();
		student.setStudentName(name);  //name variable here are from the @RequestParam
		student.setStudentHobbies(hobbies);	
		-- then we don't need to write this*/	
		
		//This means if it has error which is binding by the BindingResylt Parameter it will catch here and return the same JSP
		if(bindingResult.hasErrors()){
			ModelAndView modelError=new ModelAndView("AdmissionFormTu13");
			return modelError;
			
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccessTu13");
		//model.addObject("msg1","សូមស្វាគមន៏ការមកដល់របស់លោកអ្នក");
		// and also this line -- model.addObject("student",student); //return the model class here
		return model;
	}


}
