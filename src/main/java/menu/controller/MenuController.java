package menu.controller;


import menu.model.Dish;
import menu.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private DishService dishService;

    @GetMapping("/vegan")
    public String vegan(@RequestParam(name = "name", required = false, defaultValue = "vegan") String name, Model model) {
        model.addAttribute("name", name);
        return "menu";
    }

    @GetMapping("/noVegan")
    public String noVegan(@RequestParam(name = "name", required = false, defaultValue = "noVegan") String name, Model model) {
        model.addAttribute("name", name);
        return "menu";
    }

    @GetMapping("/getAll")
    public String getAll(Model model) {
        List<Dish> dishList = dishService.generatDishesMap();
        model.addAttribute("dishList",dishList);
        return "menu";
    }

}
