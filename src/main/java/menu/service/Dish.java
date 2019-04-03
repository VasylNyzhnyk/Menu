package menu.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDish;
    private String title;
    private double price;
    private boolean vegan;
    private int calories;

    public Dish() {
    }

    public Dish(Integer idDish, String title, double price, boolean vegan, int calories) {
        this.idDish = idDish;
        this.title = title;
        this.price = price;
        this.vegan = vegan;
        this.calories = calories;
    }

    public Integer getIdDish() {
        return idDish;
    }

    public void setIdDish(Integer idDish) {
        this.idDish = idDish;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "idDish=" + idDish +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", vegan=" + vegan +
                ", calories=" + calories +
                '}';
    }
}
