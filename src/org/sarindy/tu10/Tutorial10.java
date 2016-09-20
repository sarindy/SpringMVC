package org.sarindy.tu10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tutorial10 {
	
	@RequestMapping(value="/admissionForm.html",method = RequestMethod.GET)
	public ModelAndView getAdmission(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobbies") String hobbies){
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg1","សូមស្វាគមន៏ការមកដល់របស់លោកអ្នក");
		model.addObject("msg2", "លោកអ្នកឈ្មោះ​ ៖ " + name + " ហើយចូលចិត្ត ៖ " + hobbies);
		return model;
	}
	
	

}
