package models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Order {

    public enum OrderStatus { OPEN, PENDING, FULFILLED, CANCELLED }

    public enum OrderType { INVENTORY, HOG }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Enumerated(EnumType.STRING)
    private OrderType type;

    private LocalDateTime orderDate = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Item> orderItems = new ArrayList<>();

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Hog> orderHogs = new ArrayList<>();

    private double discount = 0.0;

    private boolean paid = false;
    private LocalDateTime paidDate;
    private boolean shipped = false;
    private LocalDateTime shippedDate;
    private String notes;


}
