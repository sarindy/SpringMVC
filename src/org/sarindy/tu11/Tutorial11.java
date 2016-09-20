package org.sarindy.tu11;

import org.sarindy.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tutorial11 {
	
	@ModelAttribute
	public void addingCommonObject(Model model1){
	
		model1.addAttribute("msg1","សូមស្វាគមន៏ការមកដល់របស់លោកអ្នក");//This means all the msg1 jsp has all this text/object
	}

	@RequestMapping(value = "/AdmissionFormTu11.html", method = RequestMethod.GET)
	public ModelAndView getAdmission() {
		ModelAndView model = new ModelAndView("AdmissionFormTu11");
		return model;
	}

	@RequestMapping(value="/submitAdmissionFormTu11.html",method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,
			@RequestParam("studentHobbies") String hobbies){
		
		Student student = new Student();
		student.setStudentName(name);  //name variable here are from the @RequestParam
		student.setStudentHobbies(hobbies);		
		
		ModelAndView model = new ModelAndView("AdmissionSuccessTu11");
		//model.addObject("msg1","សូមស្វាគមន៏ការមកដល់របស់លោកអ្នក");
		model.addObject("student",student); //return the model class here
		return model;
	}

	// Below methode using the Model Attribute by binding the model class
	// student in the request param
	// But at this point we needed to be careful with the variable name in model
	// class and with the those
	// in the jsp view file it should the same.

	@RequestMapping(value="/submitAdmissionFormTu11ModelAtt.html",method = RequestMethod.POST)
	public ModelAndView submitAdmissionFormModelAtt(@ModelAttribute("student") Student student){
		
		/*-- Student student = new Student();
		student.setStudentName(name);  //name variable here are from the @RequestParam
		student.setStudentHobbies(hobbies);	
		-- then we don't need to write this*/	
		
		ModelAndView model = new ModelAndView("AdmissionSuccessTu11");
		//model.addObject("msg1","សូមស្វាគមន៏ការមកដល់របស់លោកអ្នក");
		// and also this line -- model.addObject("student",student); //return the model class here
		return model;
	}
	
	
}
