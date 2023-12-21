package com.example.voiture;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="EUREKA-CLIENT")
public interface ClientService {
    @GetMapping(path = "/clients/{id}")
    Client clientById(@PathVariable Long id);

}
