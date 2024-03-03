package Bridge;

public class HDVideoProcessor implements VideoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println(videoFile+" is being played in HD");
    }
}
