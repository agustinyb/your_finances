package com.yourfinances.repository;

import com.yourfinances.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Users,Integer> {


    Users findByEmail(String email);
}
