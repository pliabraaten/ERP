package dtos;

import lombok.Data;
import models.Household;

@Data
public class ClientDTO {

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String notes;
    private Household household;

}
