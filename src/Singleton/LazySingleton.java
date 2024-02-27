package Singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton instance = null;

    private LazySingleton()
    {
        // therefore now bahar se koi iska object ni banaa sakta
    }

    public static LazySingleton getInstance()
    {
        //static methods are associated to class.
        if(instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }
}
