package menu.controller;
import menu.service.Dish;
import menu.service.DishRepository;
//import menu.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private DishRepository dishRepository;

    @GetMapping("/menu")
    public String getAll(@RequestParam(name = "vegan", required = false) Boolean vegan, Model model) {
        model.addAttribute("vegan",vegan);
        Iterable<Dish> dishList;
        if (vegan == null) {
            dishList = dishRepository.findAll();
        } else {
            dishList = dishRepository.findByVegan(vegan);
        }
        model.addAttribute("dishList", dishList);
        return "menu";
    }


    @PostMapping("/menuPost")
    public String getAllPost(@RequestParam(name = "vegan", required = false) Boolean vegan, Model model) {
        List<Dish> dishList = dishRepository.findByVegan(vegan);
        model.addAttribute("dishList", dishList);
        return "menu";
    }

    @GetMapping("/menu/price")
    //Controller = Server, Browser = Client;    Client->Server // MVC V(request)->C->M->V(response=html)
    public String getAllByPrice(@RequestParam(name = "price", required = false) Double price, Model model) {
        List<Dish> dishList = dishRepository.findByPrice(price);
        model.addAttribute("dishListAttribute", dishList);
        return "menu";
        // Spring Thymelief
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        return "redirect:/menu";
    }

    @PostMapping("/saveDishesAction")
    public String saveDishesAction(@ModelAttribute Dish dish, BindingResult errors, Model model) {
        dishRepository.save(dish);
        return "redirect:/menu";
    }

    @GetMapping("/saveDishes")
    public String showSaveDishes(@ModelAttribute Dish dish, Model model) {
        model.addAttribute("timeShow", new Date());
        return "saveDishes";
    }


}
