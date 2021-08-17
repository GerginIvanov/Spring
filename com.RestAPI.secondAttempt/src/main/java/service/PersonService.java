package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.PersonDao;
import model.Person;

@Service
public class PersonService {

	private final PersonDao personDao;

	@Autowired
	public PersonService(@Qualifier("fakeDao") PersonDao personDao) { //!!! we can change the qualifier to change DB implementations
		super();
		this.personDao = personDao;
	}

	public int addPerson(Person person) {
		return personDao.insertPerson(person); 
	}

}
