package Zoo2;

public class Bird2 extends Animal2 {

    protected String featherColor;
    protected boolean canFly;

    public Bird2(String name, int age, String featherColor, boolean canFly) {
        super(name, age);
        this.featherColor = featherColor;
        this.canFly = canFly;
    }

    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public String toString() {
        return "Bird2{" +
                "featherColor='" + featherColor + '\'' +
                ", canFly=" + canFly +
                "} " + super.toString();
    }
}
