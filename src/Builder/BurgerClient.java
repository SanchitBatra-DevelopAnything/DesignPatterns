package Builder;

public class BurgerClient {

    public static void main(String args[])
    {
        Burger b = new Burger.BurgerBuilder().Mayonese(true).Onions(true).Tikkis(4).build();

       // Burger exception = new Burger.BurgerBuilder().Mayonese(true).Onions(true).build();

        System.out.println(b);
    }
}
