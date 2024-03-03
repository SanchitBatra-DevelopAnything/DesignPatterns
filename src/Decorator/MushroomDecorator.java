package Decorator;

public class MushroomDecorator extends PizzaDecorator{

    public MushroomDecorator(Pizza inputPizza)
    {
        super(inputPizza);
    }

    @Override
    public int add() {
        return inputPizza.add() + addMushroom();
    }

    public int addMushroom()
    {
        return 45;
    }
}
