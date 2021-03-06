package net.javaguides.springboot.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.javaguides.springboot.model.Person;
import net.javaguides.springboot.service.PersonService;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@PostMapping
	public void addPerson(@Valid @NotNull @RequestBody Person person) {
		personService.addPerson(person);
	}

	@GetMapping
	public List<Person> getAllPeople() {
		return personService.getAllPeople();
	}

	@GetMapping(path = "{id}")
	public Person getPersonById(@PathVariable("id") UUID id) {
		return personService.getPersonById(id).orElse(null);
	}

	@DeleteMapping(path = "{id}")
	public void deletePersonById(@PathVariable("id") UUID id) {
		personService.deletePerson(id);
	}

	@PutMapping(path = "{id}")
	public void updatePersonById(
			@PathVariable("id") UUID id,
			@Valid @NotNull @RequestBody Person personToUpdate) {
		personService.updatePerson(id, personToUpdate);
	}

}
