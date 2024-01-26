package Zoo;

public class Bird extends Animal {

    private final String featherColor;

    private final boolean canFly;

    public String getFeatherColor() {
        return featherColor;
    }



    public boolean isCanFly() {
        return canFly;
    }



    public Bird(String name, int age, String featherColor, boolean canFly) {
        super(name, age);
        this.featherColor = featherColor;
        this.canFly = canFly;
    }

    public void fly(){
        System.out.println(name + " is flying");
    }
@Override
    public void eat(){
    System.out.println("The bird is eating seeds.");
}

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                ", canFly=" + canFly +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} ";
    }
}
