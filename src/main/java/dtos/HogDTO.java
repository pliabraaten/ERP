package dtos;

import lombok.Data;
import models.Hog;
import models.Order;

@Data
public class HogDTO {

    private Long id;
    private int hogNumber;
    private Hog.HogType hogType;
    private double liveWeight;
    private double hangingWeight;
    private boolean inspected = false;
    private String processor;
    private double processingCost;
    private Order order;

}
