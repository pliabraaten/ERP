package dtos;

import lombok.Data;

@Data
public class ItemDTO {

    private Long id;
    private String name;
    private String type;
    private int quantity;
    private double price;

}
