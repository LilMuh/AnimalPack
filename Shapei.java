package ExtendPrac;

public class Shapei extends Dog{
    @Override
    public void eat() {
        super.eat();
        System.out.println("它觉得没吃饱，又吃了根骨头");
    }
}
