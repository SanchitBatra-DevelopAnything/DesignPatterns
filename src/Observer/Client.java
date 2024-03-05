package Observer;

public class Client {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Channel c = new NewsChannel();
        agency.addObserver(c);

        agency.setNews("Osama did the 9/11");
    }
}
