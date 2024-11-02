package ua.edu.ucu.apps.FlowerStore.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table
public class Flower extends Item {
    @Id
    private Long id;
    private double sepalLength;
    private FlowerType flowerType;
    private double price;

    public Flower(int sepalLength, int price, FlowerType type) {
        super("Flower Object");
        this.sepalLength = sepalLength;
        this.price = price;
        this.flowerType = type;
    }

    public Flower(Flower flower) {
        super("Flower Object");
        sepalLength = flower.sepalLength;
        price = flower.price;
        flowerType = flower.flowerType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        Flower otherFlower = (Flower) obj;
        return sepalLength == otherFlower.sepalLength 
        && price == otherFlower.price
        && flowerType == otherFlower.flowerType;
    }

    @Override
    public int hashCode() {
        double result = sepalLength;
        result = 31 * result + price;
        if (flowerType != null) {
            result = 31 * result + flowerType.hashCode();
        }
        else {
            result = 31 * result;
        }
        return (int) result;
    }

}
