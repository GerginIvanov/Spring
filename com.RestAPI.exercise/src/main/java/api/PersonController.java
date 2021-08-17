package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RequestMapping("/index")

@RestController
public class PersonController {

	@GetMapping("/greeting")
	public String hello() {
		return "Hello, World!";
	}
	
	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	@PostMapping("/person")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
}
