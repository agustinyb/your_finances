package com.yourfinances.repository;

import java.util.List;
import java.util.Optional;

import com.yourfinances.entities.Transactions;
import com.yourfinances.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);

    @Query("SELECT u.id FROM User u WHERE u.username = :username")
    Integer findIdPerUsername(@Param("username") String username);
}