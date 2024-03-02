package Prototype;

import java.util.HashMap;

public class VehicleRegistry {
    private static HashMap<String , Vehicle> hm = new HashMap<>();

    static {
        hm.put("TWO" , new TwoWheeler("125cc" , "Suzuki latest" , 100000 , true));
        hm.put("FOUR" , new FourWheeler("250cc" , "Suzuki latest" , 600000 , true , false));
    }

    public Vehicle giveVehicle(String vehicle) throws CloneNotSupportedException {
        return hm.get(vehicle).clone();
    }
}
