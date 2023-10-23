package ExtendPrac;

public class Rabbits extends Animal{
    public Rabbits() {
    }

    public Rabbits(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The rabbit is eating a carrot");
    }
}
