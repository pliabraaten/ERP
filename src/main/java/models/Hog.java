package models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Hog {

    public enum HogType { WHOLE, HALF}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int hogNumber;

    @Enumerated(EnumType.STRING)
    private HogType hogType;

    private double liveWeight;
    private double hangingWeight;

    private boolean inspected = false;

    private String processor;  // TODO: make processor a selected field
    private double processingCost;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
