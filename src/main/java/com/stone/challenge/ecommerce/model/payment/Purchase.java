package com.stone.challenge.ecommerce.model.payment;

import com.stone.challenge.ecommerce.dto.payment.RequestPayment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity(name = "Purchase")
@Table(name = "star_purchases", schema = "starstone-ecommerce")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "client_id")
    String client_id;
    @Column(name = "purchase_id")
    String purchase_id;
    @Column(name = "value")
    int value;
    @Column(name = "date_buy")
    String date;
    @Column(name = "card_number")
    String card_number;

    public Purchase(RequestPayment data){
        this.client_id = data.client_id();
        this.purchase_id = "none";
        this.value = data.total_to_pay();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.date = dtf.format(LocalDateTime.now());
        this.card_number = data.credit_card().card_number();
    }
}
