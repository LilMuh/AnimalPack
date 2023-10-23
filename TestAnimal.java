package ExtendPrac;

public class TestAnimal {
    public static void main(String[] args) {
        Frogs f = new Frogs("Froggy", 2);
        Rabbits r = new Rabbits("Bunny", 1);
        Dog d = new Dog("Doggie", 3);

        f.eat();
        r.eat();
        d.eat();
        d.bark();
        f.swim();
        r.eat();
        d.swim();
    }
}
