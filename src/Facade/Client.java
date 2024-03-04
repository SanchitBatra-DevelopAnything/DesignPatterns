package Facade;

public class Client {
    public static void main(String[] args) {
        ZomatoFacade facade = new ZomatoFacade(new Restaurant() , new DeliveryTeam());
        facade.placeOrder();
    }
}
