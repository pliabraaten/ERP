package models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;


    private String email;


    private String phoneNumber;


    private String notes;

    @ManyToOne
    @JoinColumn(name = "household_id", nullable = false)  // Name column; client record has to be tied to a household
    private Household household;


}
