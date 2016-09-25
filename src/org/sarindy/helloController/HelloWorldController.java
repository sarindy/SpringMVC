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
	
	@RequestMapping("/bootstrap")
	public ModelAndView getBootStrap(){
		ModelAndView model = new ModelAndView("bootstrapTest");
		model.addObject("htmlcode","<div class=\"container\">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's " + 
		"standard dummy text ever since the 1500s, when an unknown printer took " +
		"a galley of type and scrambled it to make a type specimen book. It has"+
		"survived not only five centuries, but also the leap into electronic"+
		"typesetting, remaining essentially unchanged. It was popularised in"+
		"the 1960s with the release of Letraset sheets containing Lorem Ipsum"+
		"passages, and more recently with desktop publishing software like"+
		"Aldus PageMaker including versions of Lorem Ipsum.</div><p>");
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
