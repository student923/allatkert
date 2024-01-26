package Zoo;

public class Mammal extends Animal implements EatableInterface{

    private final String furColor;

    private final int numLegs;


    public Mammal(String name, int age, String furColor, int numLegs) {
        super(name, age);
        this.furColor = furColor;
        this.numLegs = numLegs;
    }

    @Override
    public void eat(){
        System.out.println("The mammal is eating some meat.");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "furColor='" + furColor + '\'' +
                ", numLegs=" + numLegs +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} ";
    }
}
