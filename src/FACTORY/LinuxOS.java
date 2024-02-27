package FACTORY;

public class LinuxOS extends OperatingSystem{

    //has its type and version
    public LinuxOS(String type , String version)
    {
        super(type , version);
    }

    @Override
    public void getDir(String command) {
        System.out.println("Command of getDIR run on linux implementation");
    }

    @Override
    public void removeDir(String command) {
        System.out.println("Command of remDIR run on linux implementation");
    }
}
