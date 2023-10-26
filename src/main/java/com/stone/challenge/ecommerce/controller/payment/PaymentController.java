package com.stone.challenge.ecommerce.controller.payment;


import com.stone.challenge.ecommerce.dto.payment.RequestPayment;
import com.stone.challenge.ecommerce.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/starstone")
public class PaymentController {

    @Autowired
    PaymentService service;


    @PostMapping("/buy")
    public ResponseEntity newTransaction(@RequestBody @Validated RequestPayment data){
        return ResponseEntity.ok().body(service.newTransaction(data));
    }

    @GetMapping("/history")
    public ResponseEntity getAllTransactions(){
        return ResponseEntity.ok().body(service.getAllTransactions());
    }

    @GetMapping("/history/{clientId}")
    public ResponseEntity getFilterTransaction(@PathVariable String clientId){
        return ResponseEntity.ok().body(service.getAllTransactionsClient(clientId));
    }

}
