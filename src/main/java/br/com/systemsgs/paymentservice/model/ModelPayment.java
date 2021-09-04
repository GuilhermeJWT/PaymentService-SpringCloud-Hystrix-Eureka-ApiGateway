package br.com.systemsgs.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "payment_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelPayment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;

}
