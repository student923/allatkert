package Zoo2;

import java.util.ArrayList;
import java.util.List;

public class ZooService2 implements ZooInterface2 {

    protected List<Bird2> bird2s = new ArrayList<>();
    protected List<Mammal2> mammal2s = new ArrayList<>();



    @Override
    public void addBird(Bird2 bird) {
        bird2s.add(bird);
    }

    @Override
    public void addMammal(Mammal2 mammal) {
        mammal2s.add(mammal);
    }

    @Override
    public void displayBirdInfo() {
        System.out.println(bird2s);
    }

    @Override
    public void displayMammalInfo() {
        System.out.println(mammal2s);
    }
}
