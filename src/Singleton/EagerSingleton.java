package Singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton(); //yahin banaado. //when this class is loaded in JVM tabhi ye object ban jaayga.

    private EagerSingleton()
    {

    }

    public static EagerSingleton getInstance() { return instance; }
}
