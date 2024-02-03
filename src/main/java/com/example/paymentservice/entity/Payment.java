package com.example.paymentservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "payment_id")
    @SequenceGenerator(name = "payment_id",sequenceName = "PAYMENT_ID_SEQ",allocationSize = 1)
    private Long id;
    private Long orderId;
    private Date paymentDate;
    private double amount;

}
