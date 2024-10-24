package ua.edu.ucu.apps.FlowerStore.flower;
//Business layer
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //або компонент
public class FlowerService {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
