package com.example.springwebservice.model;

import com.example.springwebservice.model.entity.mtsmb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtmsbRepository extends JpaRepository<mtsmb, String> {
}
