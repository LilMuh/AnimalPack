package ExtendPrac;

public class Frogs extends Animal implements Swim{

    public Frogs() {
    }

    public Frogs(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The frog is eating insects");
    }

    @Override
    public void swim() {
        System.out.println("The frog is swimming");
    }
}
