package ua.edu.ucu.apps.FlowerStore.flower;

public class RibbonDecorator extends ItemDecorator{

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", with ribbon";
    }
    
    public double getPrice() {
        return 40 + this.item.getPrice();
    }
}
