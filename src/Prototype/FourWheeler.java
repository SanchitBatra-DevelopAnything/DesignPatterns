package Prototype;

public class FourWheeler extends Vehicle{
    private boolean isAutomatic;
    private boolean isDiesel;

    public FourWheeler(String engine , String model , long price , boolean isAutomatic , boolean isDiesel)
    {
        super(engine , model , price);
        this.isAutomatic = isAutomatic;
        this.isDiesel = isDiesel;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    protected FourWheeler clone() throws CloneNotSupportedException {
        return (FourWheeler)super.clone();
    }
}
