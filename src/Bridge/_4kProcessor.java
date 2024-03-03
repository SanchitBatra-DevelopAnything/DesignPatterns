package Bridge;

public class _4kProcessor implements VideoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println(videoFile+" is being played in 4k");
    }
}
