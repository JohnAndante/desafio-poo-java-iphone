public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.openApp("Dialer");
        iPhone.callNumber("44 98765-4321");
        iPhone.answerCall();
        iPhone.endCall();
        iPhone.callHistory();

        iPhone.callNumber("44 98765-4321");
        iPhone.callVoiceMail();
        iPhone.switchMuteCall();
        iPhone.switchSpeakerCall();
        iPhone.endCall();
        iPhone.closeApp("Dialer");

        iPhone.openApp("AppleMusic");
        iPhone.play("Música Sample 1");
        iPhone.pause();
        iPhone.stop();
        iPhone.playPlaylist();
        iPhone.next();
        iPhone.previous();
        iPhone.forward();
        iPhone.rewind();
        iPhone.repeat();
        iPhone.closeApp("AppleMusic");

        iPhone.openApp("Safari");
        iPhone.search("Java");
        iPhone.setUrl("https://www.google.com");
        iPhone.openNewTab();
        iPhone.closeTab();
        iPhone.switchTab(1);
        iPhone.setHomePage("https://www.google.com");
        iPhone.closeApp("Safari");
    }
}
