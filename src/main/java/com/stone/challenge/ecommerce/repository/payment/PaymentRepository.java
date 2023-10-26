package com.stone.challenge.ecommerce.repository.payment;

import com.stone.challenge.ecommerce.model.payment.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Purchase, String> {
    @Query("SELECT p FROM Purchase p WHERE p.client_id = :clientId")
    List<Purchase> findAllByClientId(@Param("clientId") String clientId);
}
