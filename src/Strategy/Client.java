package Strategy;

public class Client {
    public static void main(String[] args) {
        //add operation ka context.
        Context add = new Context(new OperationAdd());
        System.out.println(add.executeStrategy(1,4));

        Context sub = new Context(new OperationSubtract());
        System.out.println(sub.executeStrategy(5,3));
    }
}
