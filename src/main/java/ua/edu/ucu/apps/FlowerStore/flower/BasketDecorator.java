package ua.edu.ucu.apps.FlowerStore.flower;

public class BasketDecorator extends ItemDecorator{

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", in a basket";
    }

    public double getPrice() {
        return 4 + this.item.getPrice();
    }
}
