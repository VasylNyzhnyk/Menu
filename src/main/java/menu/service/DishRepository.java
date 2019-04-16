package menu.service;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DishRepository extends CrudRepository<Dish, Integer> {

    List<Dish> findByTitle(String title);

    List<Dish> findByPrice(Double Price);

    List<Dish> findByVegan(Boolean vegan);
}
