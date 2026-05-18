package dtos;

import lombok.Data;
import models.Customer;
import models.Hog;
import models.Item;
import models.Order;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {

    private Long id;
    private Order.OrderStatus status;
    private Order.OrderType type;
    private LocalDateTime orderDate;
    private Customer customer;
    private List<Item> orderItems;
    private List<Hog> orderHogs;
    private double discount;
    private boolean paid;
    private LocalDateTime paidDate;
    private boolean shipped;
    private LocalDateTime shippedDate;
    private String notes;

}
