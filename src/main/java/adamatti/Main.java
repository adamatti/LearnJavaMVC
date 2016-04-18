package adamatti;

import adamatti.dao.PersonDao;
import adamatti.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan("adamatti")
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
        addFakeData(ctx);
    }

    private static void addFakeData(ApplicationContext ctx){
        PersonDao dao = ctx.getBean(PersonDao.class);

        dao.save(new Person("Marcelo",1000));
        dao.save(new Person("Adamatti",2000));
    }
}
