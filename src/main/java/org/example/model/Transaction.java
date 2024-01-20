package org.example.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Transaction {
    private UUID transaction_id;
    private UUID account_id;
    private BigDecimal amount;
    private LocalDateTime transaction_date;
    private String description;
    private String transaction_type;
    private String label;
}
