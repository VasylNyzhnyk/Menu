package menu.service;

import menu.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

}
