package Prototype;

public class TwoWheeler extends Vehicle{

    private boolean isElectric;

    public TwoWheeler(String engine , String model , long price , boolean isElectric)
    {
        super(engine , model , price);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    protected TwoWheeler clone() throws CloneNotSupportedException{
        return (TwoWheeler)super.clone(); //its calling vehicle.clone();
    }
}
