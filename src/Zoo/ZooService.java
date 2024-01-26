package Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooService implements ZooInterface {

    private final List<Bird> birds = new ArrayList<>();
    private final List<Mammal> mammals = new ArrayList<>();


    @Override
    public void addBird(Bird bird) {

        birds.add(bird);


    }


    @Override
    public void addMammal(Mammal mammal) {
        mammals.add(mammal);
    }


    @Override
    public void displayBirdInfo() {
        System.out.println("Birds: " + birds);
    }

    @Override
    public void displayMammalInfo() {
        System.out.println("Mammals: " + mammals);
    }
}
