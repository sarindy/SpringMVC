package org.sarindy.helloController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("myHelloPage");
		model.addObject("myWelcomeMessage","បងសំណាងណាស់ដែលមានអូនក្នុងជាតិនេះ");
		return model;
		
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		ModelAndView model = new ModelAndView("myHelloPage");
		model.addObject("myWelcomeMessage","Hi World...");
		return model;
		
	}
	
	@RequestMapping("/list")
	public ModelAndView getList(){
		
		List<String> list=new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		
		
		ModelAndView model = new ModelAndView("myHelloPage");
		model.addObject("myLists",list);
		return model;
		
	}


}
