package no.edipost.interview.controller;


import no.edipost.interview.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Hello Controller
 *
 * @author Mathias Bjerke
 */
@Controller
public class HelloController {
	private final HelloService helloService;


	public HelloController( HelloService helloService ) {
		this.helloService = helloService;
	}


	@RequestMapping( value = "/hello", method = RequestMethod.GET )
	public String order( Model model ) {
		model.addAttribute( "hello", helloService.sayHello() );

		return "hello";
	}
}
