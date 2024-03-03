package Bridge;

public abstract class Video {
    protected VideoProcessor processor;
    public Video(VideoProcessor vp)
    {
        this.processor = vp;
    }

    public abstract void play(String video);
}
