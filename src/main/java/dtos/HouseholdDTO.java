package dtos;

import lombok.Data;
import models.Customer;

import java.util.List;

@Data
public class HouseholdDTO {

    private Long id;
    private String surname;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private List<Customer> members;

}
