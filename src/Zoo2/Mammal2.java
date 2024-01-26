package Zoo2;

public class Mammal2 extends Animal2 {

    protected String furColor;
    protected int numLeg;

    public Mammal2(String name, int age, String furColor, int numLeg) {
        super(name, age);
        this.furColor = furColor;
        this.numLeg = numLeg;
    }

    @Override
    public String toString() {
        return "Mammal2{" +
                "furColor='" + furColor + '\'' +
                ", numLeg=" + numLeg +
                "} " + super.toString();
    }
}
