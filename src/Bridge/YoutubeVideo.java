package Bridge;

public class YoutubeVideo extends Video{

    public YoutubeVideo(VideoProcessor vp)
    {
        super(vp);
    }

    @Override
    public void play(String video) {
        //processor extended from the parent.
        processor.process(video);
    }
}
