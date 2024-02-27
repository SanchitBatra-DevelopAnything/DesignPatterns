package FACTORY;

public class WindowsOS extends OperatingSystem{

    public WindowsOS(String type , String version)
    {
        super(type , version);
    }

    @Override
    public void getDir(String command) {
        System.out.println("Windows command for getDir");
    }

    @Override
    public void removeDir(String command) {
        System.out.println("Windows command for remDir");
    }
}
