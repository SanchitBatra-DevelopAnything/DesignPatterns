package FACTORY;

public class OSFactory {

    private OSFactory()
    {
        //constructor private kardo , cuz we dont want user to create a factory
        //we just want to create objects from the factory using getInstance method.
    }

    //getInstance would return an OperatingSystem based on some condition
    //static rakhlo na object ni banaana factory ka.
    public static OperatingSystem getInstance(String type , String version)
    {
        switch (type){
            case "WINDOWS" : return new WindowsOS(type , version);
            case "LINUX" : return new LinuxOS(type , version);
            case "default" : throw new IllegalArgumentException("OS NOT SUPPORTED");
        }
        return null;
    }
}
