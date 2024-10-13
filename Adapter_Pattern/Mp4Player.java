package Adapter_Pattern;

// Concrete class implementing Advanced MediaPlayer
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP$ filename:- " + fileName);
    }

}
