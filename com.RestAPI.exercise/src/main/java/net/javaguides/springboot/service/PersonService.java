package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dao.PersonDao;
import net.javaguides.springboot.model.Person;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("Postgres") PersonDao personDao) { //!!! we can change the qualifier to change DB implementations
        super();
        this.personDao = personDao;
    }

    public void addPerson(Person person) {
        personDao.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonById(id);
    }

    public void deletePerson(UUID id) {
        personDao.deletePersonById(id);
    }

    public void updatePerson(UUID id, Person person) {
        personDao.updatePersonById(id, person);
    }
}














