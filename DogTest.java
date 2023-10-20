package ExtendPrac;

import java.sql.SQLOutput;

public class DogTest {
    public static void main(String[] args) {

        System.out.println("=========这是一只哈士奇=========");
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.bark();
        h.breakHome();

        System.out.println("=========这是一只中华田园犬=========");
        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.bark();

        System.out.println("=========这是一只沙皮狗=========");
        Shapei s = new Shapei();
        s.eat();
        s.drink();
        s.bark();

    }

}
