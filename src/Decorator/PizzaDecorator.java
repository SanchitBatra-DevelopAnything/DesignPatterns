package Decorator;

public abstract class PizzaDecorator implements Pizza{

    protected Pizza inputPizza;
    public PizzaDecorator(Pizza inputPizza)
    {
        this.inputPizza = inputPizza;
    }

    @Override
    public abstract int add();
}
