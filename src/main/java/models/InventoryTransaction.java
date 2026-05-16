package models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class InventoryTransaction {

    public enum TransactionType { ADJUSTMENT, ARRIVAL, ORDER }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private int changeAmount;

    private LocalDateTime transactionDate = LocalDateTime.now();

    private String notes;

}
