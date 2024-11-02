package ua.edu.ucu.apps.FlowerStore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.edu.ucu.apps.FlowerStore.flower.Item;
import ua.edu.ucu.apps.FlowerStore.flower.FlowerBucket;
import ua.edu.ucu.apps.FlowerStore.flower.PaperDecorator;
import ua.edu.ucu.apps.FlowerStore.flower.RibbonDecorator;
import ua.edu.ucu.apps.FlowerStore.flower.BasketDecorator;
import ua.edu.ucu.apps.FlowerStore.flower.CactusFlower;

public class DecoratorTest {
    @Test
    public void testDecorators() {
        Item flowerBucket = new FlowerBucket();
        flowerBucket = new PaperDecorator(flowerBucket);
        flowerBucket = new RibbonDecorator(flowerBucket);

        assertEquals("Flower bucket with 0 flowers, wrapped in paper, with ribbon", flowerBucket.getDescription());
        assertEquals(53, flowerBucket.getPrice());
    }

    @Test
    public void testReorderingDecorators() {
        Item flowerBucket = new FlowerBucket();
        flowerBucket = new RibbonDecorator(flowerBucket);
        flowerBucket = new BasketDecorator(flowerBucket);
        flowerBucket = new PaperDecorator(flowerBucket);

        assertEquals("Flower bucket with 0 flowers, with ribbon, in a basket, wrapped in paper", flowerBucket.getDescription());
        assertEquals(57, flowerBucket.getPrice());
    }

    @Test
    public void testAddFlowersAfterDecoration() {
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlower(new CactusFlower());

        Item decoratedBucket = new PaperDecorator(bucket);
        decoratedBucket = new RibbonDecorator(decoratedBucket);

        assertEquals("Flower bucket with 1 flowers, wrapped in paper, with ribbon", decoratedBucket.getDescription());
        assertEquals(133, decoratedBucket.getPrice());
    }
}
