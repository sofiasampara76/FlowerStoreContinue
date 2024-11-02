package ua.edu.ucu.apps.FlowerStore.flower;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", wrapped in paper";
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}
