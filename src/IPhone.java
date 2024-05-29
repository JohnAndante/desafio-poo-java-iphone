import apps.AppleMusic;
import apps.Safari;
import system.FileManager;
import apps.Dialer;

public class IPhone {
    AppleMusic appleMusic;
    Safari safari;
    Dialer dialer;
    FileManager fileManager;

    public IPhone() {
        this.appleMusic = new AppleMusic();
        this.safari = new Safari();
        this.dialer = new Dialer();
    }

    // Dialer
    public void callNumber(String number) {
        this.dialer.call(number);
    }

    public void answerCall() {
        this.dialer.answer();
    }

    public void reject() {
        this.dialer.reject();
    }

    public void endCall() {
        this.dialer.end();
    }

    public void callHistory() {
        this.dialer.callHistory();
    }

    public void callVoiceMail() {
        this.dialer.voiceMail();
    }

    public void switchMuteCall() {
        this.dialer.switchMute();
    }

    public void switchSpeakerCall() {
        this.dialer.switchSpeaker();
    }

    // AppleMusic
    public void play(String audio) {
        this.appleMusic.play(audio);
    }

    public void playPlaylist() {
        this.appleMusic.playPlaylist();
    }

    public void pause() {
        this.appleMusic.pause();
    }

    public void stop() {
        this.appleMusic.stop();
    }

    public void next() {
        this.appleMusic.next();
    }

    public void previous() {
        this.appleMusic.previous();
    }

    public void forward() {
        this.appleMusic.forward();
    }

    public void rewind() {
        this.appleMusic.rewind();
    }

    public void repeat() {
        this.appleMusic.repeat();
    }

    public void shuffle() {
        this.appleMusic.shuffle();
    }

    public void volumeUp() {
        this.appleMusic.volumeUp();
    }

    public void volumeDown() {
        this.appleMusic.volumeDown();
    }

    public void mute() {
        this.appleMusic.mute();
    }

    public void unmute() {
        this.appleMusic.unmute();
    }

    public void setVolume(int volume) {
        this.appleMusic.setVolume(volume);
    }

    public void showPlaylist() {
        this.appleMusic.showPlaylist();
    }

    public void showSettings() {
        this.appleMusic.showSettings();
    }

    // Safari
    public void browse() {
        this.safari.browse();
    }

    public void search(String query) {
        this.safari.search(query);
    }

    public void setUrl(String url) {
        this.safari.setUrl(url);
    }

    public void openNewTab() {
        this.safari.openNewTab();
    }

    public void closeTab() {
        this.safari.closeTab();
    }

    public void switchTab(int tabNumber) {
        this.safari.switchTab(tabNumber);
    }

    public void setHomePage(String url) {
        this.safari.setHomePage(url);
    }

    public void openApp(String app) {
        if (app.equals("Safari")) {
            this.safari.browse();
        } else if (app.equals("Dialer")) {
            this.dialer.callHistory();
        } else if (app.equals("AppleMusic")) {
            this.appleMusic.play("playlist");
        }
    }

    public void closeApp(String app) {
        if (app.equals("Safari")) {
            this.safari.closeTab();
        } else if (app.equals("Dialer")) {
            this.dialer.end();
        } else if (app.equals("AppleMusic")) {
            this.appleMusic.stop();
        }
    }

}
