package ua.edu.ucu.apps.FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.FlowerStore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.FlowerStore.flower.Item;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy DHLDeliveryStrategy;
    private Item mockItem1;
    private Item mockItem2;

    @BeforeEach
    public void setUp() {
        DHLDeliveryStrategy = new DHLDeliveryStrategy();
        mockItem1 = mock(Item.class);
        mockItem2 = mock(Item.class);
    }

    @Test
    public void testConstructor() {
        assertEquals("DHLDelivery", DHLDeliveryStrategy.getName());
        assertEquals("Deliver before payment", DHLDeliveryStrategy.getDescription());
    }

    @Test
    public void testDeliverWithItems() {
        when(mockItem1.getDescription()).thenReturn("Item1");
        when(mockItem2.getDescription()).thenReturn("Item2");

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        DHLDeliveryStrategy.deliver(List.of(mockItem1, mockItem2));

        String expectedOutput = "Delivered with DHLDelivery:\nItem1\nItem2";
        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    public void testDeliverWithEmptyList() {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        DHLDeliveryStrategy.deliver(List.of());

        String expectedOutput = "Nothing to deliver(";
        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }
}

