package br.com.systemsgs.paymentservice.service;

import br.com.systemsgs.paymentservice.model.ModelPayment;
import br.com.systemsgs.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public ModelPayment salvaPayment(ModelPayment modelPayment){
        modelPayment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(modelPayment);
    }

}
