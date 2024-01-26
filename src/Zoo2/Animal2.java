package Zoo2;

public class Animal2 implements EatableInterface2{
    private String name;
    private int age;

    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public String toString() {
        return "Animal2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
