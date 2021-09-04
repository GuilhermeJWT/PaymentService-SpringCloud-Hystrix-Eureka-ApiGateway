package br.com.systemsgs.paymentservice.controller;

import br.com.systemsgs.paymentservice.model.ModelPayment;
import br.com.systemsgs.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/salvar")
    public ModelPayment saPayment(@RequestBody ModelPayment modelPayment){
        return paymentService.salvaPayment(modelPayment);
    }

}
