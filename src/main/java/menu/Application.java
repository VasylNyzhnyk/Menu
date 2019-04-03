package menu;

import menu.service.Dish;
import menu.service.DishRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(DishRepository repository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // save a couple of dish
               /* repository.save(new Dish(null, "каша-гречана", 12, true, 300));
                repository.save(new Dish(null, "картопляне-пюре", 17, true, 500));
                repository.save(new Dish(null, "оселедець під шубою", 12, false, 800));
                repository.save(new Dish(null, "сирники зі сметаною", 12, false, 900));
                repository.save(new Dish(null, "риба смажена", 20, false, 1100));
                repository.save(new Dish(null, "курча-табака", 40, false, 900));*/

                // fetch all customers
                log.info("Dish found with findAll():");
                log.info("-------------------------------");
                for (Dish dish : repository.findAll()) {
                    log.info(dish.toString());
                }
                log.info("Dish found by price");
                log.info(repository.findByPrice((double)12).toString());

                log.info("");

            }
        };
    }

}