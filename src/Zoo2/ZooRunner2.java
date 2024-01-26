package Zoo2;

public class ZooRunner2 {
    public static void main(String[] args) {
        Mammal2 lion = new Mammal2("Leo", 10, "Yellow", 4);
        Bird2 pipi = new Bird2("Pipike", 2, "red", false);
        Bird2 csorika = new Bird2("Csorika", 5, "braun", true);

        lion.eat();
        pipi.eat();
        csorika.eat();

        csorika.fly();

        ZooService2 zooService2 = new ZooService2();
        zooService2.addMammal(lion);
        zooService2.addBird(pipi);
        zooService2.addBird(csorika);
        zooService2.displayMammalInfo();
        zooService2.displayBirdInfo();
    }
}
