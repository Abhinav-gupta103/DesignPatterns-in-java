package Observer_Pattern;

// This is a Concrete Observer Class
public class NewsChannel implements Observer {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("News Channel received news: " + news);
    }

}
