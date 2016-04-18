package adamatti.dao;

import adamatti.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonDao {
    private Integer lastId = 0;
    private Map<Integer,Person> table = new HashMap<Integer,Person>();
    public Collection<Person> list(){

        return table.values();
    }

    public Person save(Person entity){
        if (entity.getId() == null){
            entity.setId(lastId++);
        }
        table.put(entity.getId(),entity);
        return entity;
    }
}
