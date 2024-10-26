package ua.edu.ucu.apps.FlowerStore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.FlowerStore.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.FlowerStore.flower.Item;

public class PostDeliveryStrategyTest {

    private PostDeliveryStrategy postDeliveryStrategy;
    private Item mockItem1;
    private Item mockItem2;

    @BeforeEach
    public void setUp() {
        postDeliveryStrategy = new PostDeliveryStrategy();
        mockItem1 = mock(Item.class);
        mockItem2 = mock(Item.class);
    }

    @Test
    public void testConstructor() {
        assertEquals("Post delivery", postDeliveryStrategy.getName());
        assertEquals("Deliver after the payment", postDeliveryStrategy.getDescription());
    }

    @Test
    public void testDeliverWithItems() {
        when(mockItem1.getDescription()).thenReturn("Item1");
        when(mockItem2.getDescription()).thenReturn("Item2");

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        postDeliveryStrategy.deliver(List.of(mockItem1, mockItem2));

        String expectedOutput = "Delivered with PostDelivery:\nItem1\nItem2";
        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    public void testDeliverWithEmptyList() {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        postDeliveryStrategy.deliver(List.of());

        String expectedOutput = "Nothing to deliver(";
        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }
}
