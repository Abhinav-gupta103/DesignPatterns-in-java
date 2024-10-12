package Observer_Pattern;

// Observer interface
// this will have the method that gets called when the subject updates
public interface Observer {
    void update(String news);
}
