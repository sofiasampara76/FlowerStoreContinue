package ua.edu.ucu.apps.FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.FlowerStore.flower.Item;
import ua.edu.ucu.apps.FlowerStore.payment.CreditCardPaymentStrategy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy creditCardPayment;

    @BeforeEach
    public void setUp() {
        creditCardPayment = new CreditCardPaymentStrategy();
    }

    @Test
    public void testNameAndDescription() {
        assertEquals("CreditCard", creditCardPayment.getName());
        assertEquals("Paid with credit card!", creditCardPayment.getDescription());
    }

    @Test
    public void testPay() {
        Item item1 = mock(Item.class);
        Item item2 = mock(Item.class);
        when(item1.getPrice()).thenReturn(10.0);
        when(item2.getPrice()).thenReturn(15.0);

        List<Item> items = List.of(item1, item2);
        creditCardPayment.pay(items);
    }
}

