package AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("BUTTON FROM WINDOWS");
    }
}
