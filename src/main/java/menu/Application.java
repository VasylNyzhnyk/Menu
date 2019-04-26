package menu;

import menu.model.Dish;
import menu.model.OrderPosition;
import menu.model.Orders;
import menu.service.DishRepository;
import menu.service.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(OrderRepository repository) {
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
                Orders orders = new Orders();
                orders.setSum(30.00);

                // Fill order positions
                OrderPosition orderPosition1 = new OrderPosition();
                orderPosition1.setAmount(2);

                Dish dish = new Dish();
                dish.setIdDish(7);
                orderPosition1.setDish(dish);

                // Set order positions to order
                ArrayList<OrderPosition> orderPositions = new ArrayList<OrderPosition>();
                orderPositions.add(orderPosition1);
                orders.setOrderPositions(orderPositions);
                repository.save(orders);




              /*  log.info("Dish found with findAll():");
                log.info("-------------------------------");
                for (Dish dish : repository.findAll()) {
                    log.info(dish.toString());
                }
                log.info("Dish found by price");
                log.info(repository.findByPrice((double)12).toString());

                log.info("");*/

            }
        };
    }

}