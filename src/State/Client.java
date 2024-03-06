package State;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        State start = new StartState();
        start.doAction(context); //action karke context ko boldiya ki start state me hain ab hum..

        //maanlo player chalaaya , pehle null tha , start kara aur bola ki ab main start state me hu.

        State stop = new StopState();
        stop.doAction(context);

        //for current state context.getState().toString() <-- toString daal dena in state concrete classes.

    }
}
