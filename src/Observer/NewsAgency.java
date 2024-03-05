package Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    //this is a publisher
    private String news;
    private List<Channel> channels = new ArrayList<Channel>();

    public void addObserver(Channel c)
    {
        this.channels.add(c);
    }

    public void removeObserver(Channel c)
    {
        this.channels.remove(c);
    }

    public void setNews(String news)
    {
        this.news = news;
        for(Channel c : channels)
        {
            c.update(this.news);
        }
    }
}
