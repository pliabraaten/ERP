package dtos;

import lombok.Data;
import models.InventoryTransaction;

import java.time.LocalDateTime;

@Data
public class InventoryTransactionDTO {

    private Long id;
    private InventoryTransaction.TransactionType type;
    private int changeAmount;
    private LocalDateTime transactionDate;
    private String notes;

}
