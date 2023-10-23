package ExtendPrac;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("它在吃狗粮，好香~~");
    }

    public void drink(){
        System.out.println("它在喝水，咕嘟咕嘟，喝饱了！");
    }

    public void bark(){
        System.out.println("它警觉地发出低吼");
    }

    @Override
    public void swim() {
        System.out.println("The dog is swimming");
    }
}
