package ua.edu.ucu.apps.FlowerStore.delivery;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.FlowerStore.flower.Item;

@Getter
public class PostDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public PostDeliveryStrategy() {
        this.name = "Post delivery";
        this.description = "Deliver after the payment";
    }

    public void deliver(List<Item> items) {
        if (!items.isEmpty()) {
            String output = "Delivered with PostDelivery:";
            for (Item item: items) {
                output += "\n";
                output += item.getDescription();
            }
            System.out.println(output);
        }
        else {
            System.out.println("Nothing to deliver(");
        }
    }
}
