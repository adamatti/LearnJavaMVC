package adamatti.service;

import adamatti.dao.PersonDao;
import adamatti.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public Collection<Person> list(){
        return personDao.list();
    }

    public Person save(Person person){
        if (person.getSalary() ==null || person.getSalary()==0){
            throw new RuntimeException("Salary is required");
        }

        return personDao.save(person);
    }
}
