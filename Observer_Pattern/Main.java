package Observer_Pattern;

public class Main {
    public static void main(String[] args) {

        // Create the subject (NewsAgency)
        NewsAgency newsAgency = new NewsAgency();

        // Create observers (NewsChannel instances)
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();

        // Register observers with the subject
        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);

        // Publish news and notify all registered observers
        newsAgency.setNews("Breaking news: Java 17 is Released!");

        // Remove one observer and publish new news
        newsAgency.removeObserver(channel1);
        newsAgency.setNews("Latest Update: Java 18 is comming soon!");
    }
}
