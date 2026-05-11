package models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Household {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String surname;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    // TODO: verify this is correct and appropriate
    // Persist/Merge -> when household is saved/updated, client is also
    @OneToMany(mappedBy = "household", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Client> members = new ArrayList<>();
}
