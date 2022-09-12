package com.example.springwebservice.model;

import com.example.springwebservice.controller.dto.request.AddBalanceRequest;
import com.example.springwebservice.model.entity.User;
import com.example.springwebservice.model.entity.tcnud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import javax.persistence.JoinColumn;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "call getAddUnrealResultList(?1, ?2, ?3, ?4)", nativeQuery = true)
    Map<String, String>getAddUnrealResultList(String tradeDate, String branchNo, String custSeq, String docSeq);
}
