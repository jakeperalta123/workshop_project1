package com.example.springwebservice.model;

import com.example.springwebservice.model.entity.tcnud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TcnudRepository extends JpaRepository<tcnud, String> {
}
