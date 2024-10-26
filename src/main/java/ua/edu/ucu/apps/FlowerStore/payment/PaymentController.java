package ua.edu.ucu.apps.FlowerStore.payment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(path = "payment")
public class PaymentController {
    @GetMapping("payment")
    public List<Payment> getPayment() {
        return List.of(new PayPalPaymentStratedy(), new CreditCardPaymentStrategy());
    }
}
