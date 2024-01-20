package org.example.model;

import lombok.*;

import java.util.UUID;
@EqualsAndHashCode
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Currency {
    private UUID currency_id;
    private String currency_name;
    private String currency_code;
}
