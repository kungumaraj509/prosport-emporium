package com.mshop.restapi.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mshop.restapi.model.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}