package ua.edu.ucu.apps.FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.FlowerStore.flower.Item;
import ua.edu.ucu.apps.FlowerStore.payment.PayPalPaymentStratedy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PayPalPaymentStrategyTest {
    private PayPalPaymentStratedy payPalPayment;

    @BeforeEach
    public void setUp() {
        payPalPayment = new PayPalPaymentStratedy();
    }

    @Test
    public void testNameAndDescription() {
        assertEquals("PayPal", payPalPayment.getName());
        assertEquals("Paid with PayPal!", payPalPayment.getDescription());
    }

    @Test
    public void testPay() {
        Item item1 = mock(Item.class);
        Item item2 = mock(Item.class);
        when(item1.getPrice()).thenReturn(20.0);
        when(item2.getPrice()).thenReturn(30.0);

        List<Item> items = List.of(item1, item2);
        payPalPayment.pay(items);
    }
}
