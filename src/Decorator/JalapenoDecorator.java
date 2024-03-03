package Decorator;

public class JalapenoDecorator extends PizzaDecorator{

    public JalapenoDecorator(Pizza inputPizza)
    {
        super(inputPizza);
    }

    @Override
    public int add() {
        return inputPizza.add() + addJalapeno();
    }

    public int addJalapeno()
    {
        return 60;
    }
}
