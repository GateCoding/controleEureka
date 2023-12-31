package com.example.voiture.entities;
import com.example.voiture.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue
    private Long Id;
    private String marque;
    private String matricule;
    private String model;
    private Long id_client;
    @ManyToOne() @Transient
    private Client client;

}
