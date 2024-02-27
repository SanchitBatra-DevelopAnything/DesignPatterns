import AbstractFactory.ApplicationFactory;
import AbstractFactory.MacFactory;
import AbstractFactory.UIFactory;
import AbstractFactory.WindowsFactory;
import FACTORY.OSFactory;
import FACTORY.OperatingSystem;
import FACTORY2.Shape;
import FACTORY2.ShapeFactory;
import Singleton.enumSingleton;

public class Starter {
    public static void main(String args[])
    {
        //SINGLETON
        //enumSingleton.INSTANCE.doSomething();

        //factory design pattern
//        OperatingSystem required_os = OSFactory.getInstance("LINUX" , "XP");
//        required_os.removeDir("REM");
//
//        Shape required_shape = ShapeFactory.getInstance("CIRCLE");
//        required_shape.draw();

        //Abstract Factory Pattern
        
//        ApplicationFactory macapplicationStarter = new ApplicationFactory(new MacFactory());
//        macapplicationStarter.createAllComponents();

//        ApplicationFactory windowsApplicationStarter = new ApplicationFactory(new WindowsFactory());
//        windowsApplicationStarter.createAllComponents();

    }
}
