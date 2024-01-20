package org.example.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Account {
    private UUID account_id;
    private String account_name;
    private BigDecimal balance;
    private LocalDateTime last_update_date;
    private String password;
    private UUID currency_id;
    private String account_type;
}
