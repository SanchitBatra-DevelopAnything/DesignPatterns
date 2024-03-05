package Observer;

public class NewsChannel implements Channel{
    //this is a concrete observer

    private String news;

    @Override
    public void update(Object news) {
        //will be called from the publisher.
        System.out.println("NewsChannel got the news");
        this.news = (String)news;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
