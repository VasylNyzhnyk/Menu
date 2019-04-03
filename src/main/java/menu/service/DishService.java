package menu.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*@Service
public class DishService {
    public List<Dish> generatAllDishesMap() {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish(1, "каша-гречана", 12, true, 300));
        dishes.add(new Dish(2, "картопляне-пюре", 17, true, 500));
        dishes.add(new Dish(3, "оселедець під шубою", 12, false, 800));
        dishes.add(new Dish(4, "сирники зі сметаною", 12, false, 900));
        dishes.add(new Dish(5, "риба смажена", 20, false, 1100));
        dishes.add(new Dish(6, "курча-табака", 40, false, 900));
        dishes.add(new Dish(7, "салат Весняний", 8, true, 400));
        dishes.add(new Dish(8, "макарони", 15, true, 900));
        dishes.add(new Dish(9, "вареники з сиром", 33, false, 900));
        return dishes;

    }

      public List<Dish> generatDishesMap(Boolean vegan) {
        List<Dish> allDishes = generatAllDishesMap();
        if (vegan == null) {
            return allDishes; // return dishes;
        }
        List<Dish> veganOrNoVeganList = new ArrayList<>();
        for (Dish dish : allDishes) {
            if (dish.isVegan() == vegan) {
                veganOrNoVeganList.add(dish);
            }
        }
        return veganOrNoVeganList;
    }

}*/

