package Prototype;

public class Client {

    public static void main(String args[])
    {
        VehicleRegistry reg = new VehicleRegistry();
        Vehicle v = null;

        try {
            v = reg.giveVehicle("TWO");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}
