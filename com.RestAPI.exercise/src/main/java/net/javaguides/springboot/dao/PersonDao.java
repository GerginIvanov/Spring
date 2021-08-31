package net.javaguides.springboot.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import net.javaguides.springboot.model.Person;

public interface PersonDao {

	default void insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		insertPerson(id, person);
	}

	int insertPerson(UUID id, Person person);

	List<Person> selectAllPeople();

	Optional<Person> selectPersonById(UUID id);
	
	int deletePersonById(UUID id);
	
	int updatePersonById(UUID id, Person person);
}
