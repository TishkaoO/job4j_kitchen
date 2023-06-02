package ru.job4j.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {

    private int numberOrder;

    private List<DishDto> dishs;

    private StatusOrderDto statusOrder;

    private double toPay;

    private Instant createdAt = Instant.now();
}
