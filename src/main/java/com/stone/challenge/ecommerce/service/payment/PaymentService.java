package com.stone.challenge.ecommerce.service.payment;

import com.stone.challenge.ecommerce.dto.payment.PurchaseDTO;
import com.stone.challenge.ecommerce.dto.payment.RequestPayment;
import com.stone.challenge.ecommerce.model.payment.Purchase;
import com.stone.challenge.ecommerce.repository.payment.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository repository;

    public PurchaseDTO newTransaction(RequestPayment data){
        repository.save(new Purchase(data));
        return new PurchaseDTO(data);
    }

    @Cacheable("history-buys")
    public List<PurchaseDTO> getAllTransactions(){
        try {
            List<PurchaseDTO> response = new ArrayList<>();
            for(Purchase repositoryPurchases : repository.findAll()){
                response.add(new PurchaseDTO(repositoryPurchases));
            }
            return response;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Cacheable("client_id_buys")
    public List<PurchaseDTO> getAllTransactionsClient(String client_id){
        try {
            List<PurchaseDTO> response = new ArrayList<>();
            for(Purchase repositoryPurchases : repository.findAllByClientId(client_id)){
                response.add(new PurchaseDTO(repositoryPurchases));
            }
            return response;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


}
