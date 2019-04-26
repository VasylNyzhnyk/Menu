package menu.model;

import menu.model.OrderPosition;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double sum;

    @ElementCollection
    private List<OrderPosition> orderPositions = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public List<OrderPosition> getOrderPositions() {
        return orderPositions;
    }

    public void setOrderPositions(List<OrderPosition> orderPositions) {
        this.orderPositions = orderPositions;
    }
}
