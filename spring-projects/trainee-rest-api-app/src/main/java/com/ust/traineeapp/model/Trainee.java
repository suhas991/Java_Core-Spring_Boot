package com.ust.traineeapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "trainee_name", nullable = false, length = 50)
    private String name;

    @Column(length = 50)
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Laptop> laptops;

}
