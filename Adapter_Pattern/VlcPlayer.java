package Adapter_Pattern;

// Concrete class implementing Advanced MediaPlayer
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file Name:- " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }

}
