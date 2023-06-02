package ru.job4j.app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j.app.dto.OrderDto;

@Service
@Slf4j

public class KitchenService {
    @KafkaListener(topics = "job4j_orders")
    public void receiveOrder(OrderDto dto) {
        log.debug(dto.toString());
    }
}
