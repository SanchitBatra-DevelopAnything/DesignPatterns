package Decorator;

public class Client {
    public static void main(String[] args) {
        Pizza p = new JalapenoDecorator(new MushroomDecorator(new BasePizza()));
        System.out.println(p.add());
        //100+60+45 ;) 205 rupye.
    }
}
