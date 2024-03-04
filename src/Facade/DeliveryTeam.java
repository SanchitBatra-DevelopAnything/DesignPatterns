package Facade;

public class DeliveryTeam {

    public DeliveryBoy assignDeliveryBoy()
    {
        System.out.println("Assigned a delivery boy");
        DeliveryBoy boy = new DeliveryBoy();
        return boy;
    }
}
