package com.example.demo.infrastructure.adapters.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogErroJpaRepository extends JpaRepository<LogErroEntity, String> {
}