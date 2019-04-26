package menu.model;

import javax.persistence.*;

@Entity
public class OrderPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Dish dish;
    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
