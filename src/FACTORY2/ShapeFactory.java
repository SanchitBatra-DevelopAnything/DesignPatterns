package FACTORY2;

public class ShapeFactory {

    private ShapeFactory()
    {

    }

    public static Shape getInstance(String type)
    {
        switch(type)
        {
            case "SQUARE" : return new Square();
            case "CIRCLE" : return new Circle();
            case "default" : return null;
        }

        return null;
    }
}
