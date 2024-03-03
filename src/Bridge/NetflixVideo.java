package Bridge;

public class NetflixVideo extends Video{
    public NetflixVideo(VideoProcessor vp)
    {
        super(vp);
    }

    @Override
    public void play(String video) {
        processor.process(video);
    }
}
