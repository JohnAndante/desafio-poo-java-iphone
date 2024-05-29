package system;

public interface AudioPlayer {
    void play(String audio);

    void pause();

    void stop();

    void next();

    void previous();

    void forward();

    void rewind();

    void repeat();

    void shuffle();

    void volumeUp();

    void volumeDown();

    void mute();

    void unmute();

    void setVolume(int volume);
}
