package Bridge;

public class Client {
    public static void main(String[] args) {
        Video v = new YoutubeVideo(new _4kProcessor());
        v.play("abc.mp4");

        Video net = new NetflixVideo(new HDVideoProcessor());
        net.play("netflix.mp4");
    }
}
