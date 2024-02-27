package FACTORY;

public abstract class OperatingSystem {

    //factory pattern ke liye mainParent class ya to abstract hogi ya interface hoga.

    public String type;
    public String version;

    public OperatingSystem(String type , String version)
    {
        //abstract class can have a constructor to receive props from child using super.
        this.type = type;
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    //commands are diffrent in every operating system. Hence we'll create operating systems based on types given to factory.
    public abstract void getDir(String command);

    public abstract void removeDir(String command);
}
