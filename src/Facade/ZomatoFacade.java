package Facade;

public class ZomatoFacade {
    Restaurant r;
    DeliveryTeam team;
//    DeliveryBoy t;

    public ZomatoFacade(Restaurant r , DeliveryTeam team)
    {
        this.r = r;
        this.team = team;
    }

    public void placeOrder()
    {
        this.r.prepareOrder();
        DeliveryBoy boy = this.team.assignDeliveryBoy();
        boy.pickUpOrder();
        boy.deliverOrder();
    }
}
