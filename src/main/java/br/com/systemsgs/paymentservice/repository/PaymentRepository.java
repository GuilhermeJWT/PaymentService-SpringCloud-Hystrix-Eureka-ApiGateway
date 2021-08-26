package br.com.systemsgs.paymentservice.repository;

import br.com.systemsgs.paymentservice.model.ModelPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<ModelPayment, Long> {

}
