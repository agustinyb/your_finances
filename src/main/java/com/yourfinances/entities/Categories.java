package com.yourfinances.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String categorieName;
    String type;
}
