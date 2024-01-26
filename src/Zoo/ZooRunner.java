package Zoo;

public class ZooRunner {
    public static void main(String[] args) {

        Mammal lion = new Mammal("Manfi", 22, "Yellow", 4);

        Bird bird1 = new Bird("Csorika", 2, "yellow", true);
        Bird bird2 = new Bird("Pipi", 2, "grey", false);

        lion.eat();
        bird1.eat();
        bird2.eat();
        bird2.fly();



          ZooService zooService = new ZooService();
          zooService.addMammal(lion);
          zooService.addBird(bird1);
          zooService.addBird(bird2);

          zooService.displayMammalInfo();
          zooService.displayBirdInfo();
    }
}
