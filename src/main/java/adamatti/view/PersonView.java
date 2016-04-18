package adamatti.view;

import adamatti.entity.Person;
import adamatti.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PersonView {
    @Autowired
    private PersonService personService;

    @RequestMapping("/person")
    public Collection<Person> list() {
        return personService.list();
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public Person save(@RequestBody Person person){
        return personService.save(person);
    }
}
