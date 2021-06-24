package org.sid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PourNousContacterController {

//	public static void main(String[] args) {
//	SpringApplication.run(DemoApplication2.class, args);
//}

//@GetMapping("/hello")
//public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//	return String.format("Hello %s!", name);
//}


@GetMapping("/contacter")
public String page() {
	return "PourNousContacter";
}


}

