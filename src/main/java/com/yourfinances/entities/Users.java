package com.yourfinances.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.type.descriptor.DateTimeUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String lastName;
    String email;
    String password;
    String currency;
    LocalDateTime registerDate = LocalDateTime.now();

}
