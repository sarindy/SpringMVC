package org.sarindy.tu11;

import org.sarindy.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tutorial11 {

	@RequestMapping(value="/AdmissionFormTu11.html",method = RequestMethod.GET)
	public ModelAndView getAdmission(){
		ModelAndView model = new ModelAndView("AdmissionFormTu11");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionFormTu11.html",method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobbies") String hobbies){
		
		Student student = new Student();
		student.setStudentName(name);  //name variable here are from the @RequestParam
		student.setStudentHobbies(hobbies);		
		
		ModelAndView model = new ModelAndView("AdmissionSuccessTu11");
		model.addObject("msg1","សូមស្វាគមន៏ការមកដល់របស់លោកអ្នក");
		model.addObject("student",student); //return the model class here
		return model;
	}
	
	
}
